import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {switchMap} from 'rxjs/operators';
import {TransactionService} from '../../services/transaction.service';
import {ITransaction} from '../../models/transaction';

@Component({
  selector: 'mm-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.scss']
})
export class TransactionComponent implements OnInit {
  public transaction: ITransaction;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private transactionService: TransactionService
  ) {}

  ngOnInit(): void {
    this.route.params
      .pipe(switchMap(({id}) => this.transactionService.getTransaction(id)))
      .subscribe( (transaction) => {
        if (transaction === undefined) { this.router.navigate(['not-found']); }
        this.transaction = transaction;
      });
  }

}
