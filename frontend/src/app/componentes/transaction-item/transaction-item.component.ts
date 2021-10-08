import {Component, Input, OnInit} from '@angular/core';
import {ITransaction} from '../../models/transaction';

@Component({
  selector: '°mm-transaction-item',
  templateUrl: './transaction-item.component.html',
  styleUrls: ['./transaction-item.component.scss']
})
export class TransactionItemComponent implements OnInit {

  @Input() transaction: ITransaction;

  constructor() {
  }

  ngOnInit(): void {
  }

}
