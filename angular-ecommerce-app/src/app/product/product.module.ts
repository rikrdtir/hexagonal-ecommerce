import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProductListComponent } from './pages/product/product-list/product-list.component';
import { CategoryListComponent } from './pages/category/category-list/category-list.component';
import { ProductRoutingModule } from './product-routing.module';



@NgModule({
  declarations: [
    CategoryListComponent,
    ProductListComponent
  ],
  imports: [
    CommonModule,

    ProductRoutingModule
  ]
})
export class ProductModule { }
