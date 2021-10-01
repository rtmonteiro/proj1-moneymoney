import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Injectable} from '@angular/core';
import {Observable} from 'rxjs';
import {ITransaction} from '../models/transaction';
import {IGroup} from '../models/group';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  transactions: ITransaction[] = [
    {
      id: '1',
      idUser: '1',
      value: 15,
      currency: 'BRL',
      createdAt: new Date(),
      idGroup: '2'
    },
    {
      id: '2',
      idUser: '2',
      value: 30,
      currency: 'BRL',
      createdAt: new Date(),
      idGroup: '2'
    }
  ];

  urlPath = environment.urlPath;
  headers = new HttpHeaders(environment.headers);

  constructor(private http: HttpClient) {
  }

  getTransactions(): Observable<ITransaction[]>{
    // return of(this.transactions);
    return this.http.get<ITransaction[]>(`${this.urlPath}/transaction`, { headers: this.headers });
  }

  getTransaction(id: string): Observable<ITransaction> {
    // return of(this.transactions.find(transaction => transaction.id === id));
    return this.http.get<ITransaction>(`${this.urlPath}/transaction/${id}`, { headers: this.headers });
  }

  getTransactionsByGroup(idUser: string): Observable<Map<IGroup, ITransaction[]>> {
    return this.http.get<Map<IGroup, ITransaction[]>>(`${this.urlPath}/user/groups/${idUser}`, { headers: this.headers });
  }
}
