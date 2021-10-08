import { Component, OnInit } from '@angular/core';
import { ITransaction } from 'src/app/models/transaction';
import { TransactionService } from 'src/app/services/transaction.service';

@Component({
  selector: 'mm-new-transaction',
  templateUrl: './new-transaction.component.html',
  styleUrls: ['./new-transaction.component.scss']
})
export class NewTransactionComponent implements OnInit {

  createModel: ITransaction = {
    value: undefined,
    currency: '',
    idGroup: '',
    description: '',
    idUser: '',
  };

  constructor(private transactionService: TransactionService) { }

  ngOnInit(): void {
  }

  createTransaction(transaction: ITransaction): void {
    this.transactionService.postTransaction(transaction)
      .subscribe({
        error: err => console.error(err)
      });
  }

}

