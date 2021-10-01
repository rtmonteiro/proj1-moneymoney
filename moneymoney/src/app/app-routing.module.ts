import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TransactionsComponent } from './pages/transactions/transactions.component';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import { GraphicsComponent } from './pages/graphics/graphics.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { TransactionComponent } from './pages/transaction/transaction.component';

const appRoutes: Routes = [
  { path: 'transactions', component: TransactionsComponent },
  { path: 'transactions/:id', component: TransactionComponent },
  { path: 'graphics', component: GraphicsComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'not-found', component: PageNotFoundComponent },
  { path: '',   redirectTo: '/transactions', pathMatch: 'full' },
  { path: '**', redirectTo: '/not-found' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
