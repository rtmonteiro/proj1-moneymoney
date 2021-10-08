import { Component, OnInit } from '@angular/core';
import {UserService} from '../../services/user.service';
import {IUser} from '../../models/user';
import {Router} from '@angular/router';

@Component({
  selector: 'mm-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  loginModel = {
    email: '',
    password: ''
  };

  createModel: IUser = {
    email: '',
    password: '',
    baseCurrency: '',
    name: '',
    userName: '',
  };

  isCreating: boolean;

  constructor(private router: Router,
              private userService: UserService) { }

  ngOnInit(): void {
  }

  createUser(user: IUser): void {
    this.userService.createUser(user)
      .subscribe({
        error: err => console.error(err)
      });
  }

  login({email, password}: {email: string, password: string}): void {
    /* Sei que estou cometendo um crime ao salvar os dados sensíveis
    * de um usuário direto no localStorage, mas tô só o desespero, dsclp*/
    this.userService.login(email, password)
      .subscribe( user => {
        this.userService.user = user;
        Object.entries(user).forEach( prop => {
          localStorage.setItem(prop[0], prop[1]);
        });
        this.router.navigate(['/transactions']);
      });
  }

}
