import { Component, OnInit } from '@angular/core';
import { ITransaction } from '../../models/transaction';
import {TransactionService} from '../../services/transaction.service';

@Component({
  selector: 'mm-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  transactions: ITransaction[];

  constructor(private transactionService: TransactionService) { }

  ngOnInit(): void {
    this.transactionService.getTransactions()
      .subscribe((transactions) => {
        return this.transactions = transactions;
      });
  }

}
