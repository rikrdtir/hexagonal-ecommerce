import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
// import { DashboardComponent } from './shared/template/dashboard/dashboard.component';

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'auth/login'
  },
  // Auth routes
  {
    path: 'auth',
    loadChildren: () => import('./auth/auth.module').then(m => m.AuthModule)
  },
  // products routes
  // {
  //   path: '',
  //   component: DashboardComponent,
  //   children: [
  //     {
  //       path: '',
  //       redirectTo: 'dashboard/products',
  //       pathMatch: 'full'
  //     },
  //     {
  //       path: 'dashboard',
  //       loadChildren: () => import('./product/product.module').then(m => m.ProductModule)
  //     },
  //
  //   ]
  // },
  {
    path: '**',
    redirectTo: 'auth/login'
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
