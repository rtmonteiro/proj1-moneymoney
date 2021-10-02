import { Component, OnInit } from '@angular/core';
import {UserService} from '../../services/user.service';
import {Router} from '@angular/router';
import {IUser} from '../../models/user';

@Component({
  selector: 'mm-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  user: IUser;

  constructor(private router: Router,
              private userService: UserService) { }

  ngOnInit(): void {
    this.user = this.userService.user;
  }

  logout(): void {
    this.userService.logout();
    this.router.navigate(['/login']);
  }
}
