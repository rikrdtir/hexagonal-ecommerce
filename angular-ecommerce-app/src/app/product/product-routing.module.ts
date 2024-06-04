import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProductListComponent } from './pages/product/product-list/product-list.component';
import { CategoryListComponent } from './pages/category/category-list/category-list.component';
import { DashboardComponent } from '../shared/template/dashboard/dashboard.component';


const productRoutes: Routes = [

  {
    path: 'dashboard',
    component: DashboardComponent,
    // pathMatch: 'full',
    children: [
      // categories
      { path: 'categories', component: CategoryListComponent, },
      // products
      { path: 'products', component: ProductListComponent },
    ]

  },



];

@NgModule({
  imports: [RouterModule.forChild(productRoutes)],
  exports: [RouterModule]
})
export class ProductRoutingModule { }
