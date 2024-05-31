import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

// -- app modules
import { ProductModule } from './product/product.module';
import { OrdersModule } from './orders/orders.module';
import { SharedModule } from './shared/shared.module'
import { AuthModule } from './auth/auth.module';

/// Material

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,

    // app modules
    SharedModule,
    ProductModule,
    OrdersModule,
    AuthModule,

    // end app modules
    AppRoutingModule //Routing
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
