import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { SharedModule } from './shared/shared.module'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { ProducListComponent } from './components/product/produc-list/produc-list.component';
/// Material

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProducListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    SharedModule,
    AppRoutingModule //Routing
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
