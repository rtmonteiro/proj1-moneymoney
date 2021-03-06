import { Component, OnInit } from '@angular/core';

export interface IPage { name: string; link: string; icon: string; }

@Component({
  selector: 'mm-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
  pages: IPage[];

  constructor() { }

  ngOnInit(): void {
    this.pages = [
      {
        name: 'transactions',
        link: 'transactions',
        icon: 'payments'
      },
      {
        name: 'graphics',
        link: 'graphics',
        icon: 'bar_chart'
      },
      {
        name: 'profile',
        link: 'profile',
        icon: 'account_circle'
      },
    ];
  }

}
