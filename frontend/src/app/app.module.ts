import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import { GraphicsComponent } from './pages/graphics/graphics.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { TransactionComponent } from './pages/transaction/transaction.component';
import { MenuComponent } from './componentes/menu/menu.component';
import { MenuItemComponent } from './componentes/menu/menu-item/menu-item.component';
import { TransactionItemComponent } from './componentes/transaction-item/transaction-item.component';
import { TransactionsComponent } from './pages/transactions/transactions.component';
import { HttpClientModule } from '@angular/common/http';
import {MatTabsModule} from '@angular/material/tabs';
import {ChartjsModule} from '@ctrl/ngx-chartjs';
import { LoginComponent } from './pages/login/login.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { NewTransactionComponent } from './pages/transaction/new-transaction/new-transaction.component';

@NgModule({
  declarations: [
    AppComponent,
    TransactionComponent,
    PageNotFoundComponent,
    MenuComponent,
    MenuItemComponent,
    GraphicsComponent,
    TransactionItemComponent,
    ProfileComponent,
    TransactionComponent,
    TransactionsComponent,
    LoginComponent,
    NewTransactionComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    MatIconModule,
    MatButtonModule,
    MatTabsModule,
    ChartjsModule,
    MatFormFieldModule,
    MatInputModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
