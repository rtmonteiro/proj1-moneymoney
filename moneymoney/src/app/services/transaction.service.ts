import {Injectable} from '@angular/core';
import {Observable, of} from 'rxjs';
import {ITransaction} from '../models/transaction';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  transactions: ITransaction[] = [
    {
      id: 1,
      value: 15,
      currency: 'BRL',
      transaction_date: new Date(),
      group: {
        id: 1,
        name: 'Alimentação',
        urlImage: 'restaurant'
      }
    },
    {
      id: 2,
      value: 30,
      currency: 'BRL',
      transaction_date: new Date(),
      group: {
        id: 1,
        name: 'Alimentação',
        urlImage: 'restaurant'
      }
    }
  ];

  constructor() {
  }

  getTransactions(): Observable<ITransaction[]>{
    return of(this.transactions);
  }

  getTransaction(id: number): Observable<ITransaction> {
    return of(this.transactions.find(transaction => transaction.id === id));
  }
}
