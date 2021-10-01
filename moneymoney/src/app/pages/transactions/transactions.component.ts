import { Component, OnInit } from '@angular/core';
import { ITransaction } from '../../models/transaction';
import {TransactionService} from '../../services/transaction.service';

@Component({
  selector: 'mm-transactions',
  templateUrl: './transactions.component.html',
  styleUrls: ['./transactions.component.scss']
})
export class TransactionsComponent implements OnInit {
  transactions: ITransaction[];

  constructor(private transactionService: TransactionService) { }

  ngOnInit(): void {
    this.transactionService.getTransactions()
      .subscribe((transactions) => {
        return this.transactions = transactions;
      });
  }

}
