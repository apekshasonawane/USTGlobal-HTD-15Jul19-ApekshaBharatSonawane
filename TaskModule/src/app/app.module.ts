import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { AddtaskComponent } from './addtask/addtask.component';
import { HeaderComponent } from './header/header.component';
import { ViewalltaskComponent } from './viewalltask/viewalltask.component';

@NgModule({
  declarations: [
    AppComponent,
    AddtaskComponent,
    HeaderComponent,
    ViewalltaskComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path: 'addtask' , component: AddtaskComponent},
      {
        path : 'viewalltask', component: ViewalltaskComponent
      }
    ])
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
