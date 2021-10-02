import { Component, OnInit } from '@angular/core';
import {UserService} from '../../services/user.service';
import {Router} from '@angular/router';

@Component({
  selector: 'mm-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor(private router: Router,
              private userService: UserService) { }

  ngOnInit(): void {
  }

  logout(): void {
    this.userService.logout();
    this.router.navigate(['/login']);
  }
}
