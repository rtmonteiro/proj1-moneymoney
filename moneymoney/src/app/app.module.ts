import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import { AppRoutingModule } from './app-routing.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MenuComponent } from './componentes/menu/menu.component';
import { MenuItemComponent } from './componentes/menu/menu-item/menu-item.component';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import { GraphicsComponent } from './pages/graphics/graphics.component';
import { TransactionItemComponent } from './componentes/transaction-item/transaction-item.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { TransactionComponent } from './pages/transaction/transaction.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PageNotFoundComponent,
    MenuComponent,
    MenuItemComponent,
    GraphicsComponent,
    TransactionItemComponent,
    ProfileComponent,
    TransactionComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatIconModule,
    MatButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
