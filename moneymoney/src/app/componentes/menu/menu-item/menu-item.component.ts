import { Component, Input, OnInit } from '@angular/core';
import { IPage } from '../menu.component';

@Component({
  selector: 'mm-menu-item',
  templateUrl: './menu-item.component.html',
  styleUrls: ['./menu-item.component.scss']
})
export class MenuItemComponent implements OnInit {

  @Input() page: IPage;

  constructor() { }

  ngOnInit(): void {
  }

}
