import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, RouterOutlet } from '@angular/router';
// material
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatButtonModule } from '@angular/material/button';
import { MatExpansionModule } from '@angular/material/expansion';

// import { MatCardModule } from '@angular/material/card';
// import { MatMenuModule } from '@angular/material/menu';
// import { MatGridListModule } from '@angular/material/grid-list';
///---
// import { MatSelectModule } from '@angular/material/select';
// import { MatFormFieldModule } from '@angular/material/form-field';
// components
import { DashboardComponent } from './template/dashboard/dashboard.component';
import { SidenavComponent } from './components/sidenav/sidenav.component';

@NgModule({
  declarations: [
    DashboardComponent,
    SidenavComponent,

  ],
  imports: [
    CommonModule,
    // Material modules
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatToolbarModule,
    MatExpansionModule,
    // ---
    MatButtonModule,
    // MatGridListModule,
    // MatCardModule,
    // MatMenuModule,
    // MatFormFieldModule,
    // MatSelectModule,

    // routers
    RouterModule,
    RouterOutlet
  ],
  exports: [
  ]

})
export class SharedModule {
}
