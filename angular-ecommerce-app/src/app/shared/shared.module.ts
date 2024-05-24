import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
// material
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { MatMenuModule } from '@angular/material/menu';
import { MatListModule } from '@angular/material/list';
import { MatGridListModule } from '@angular/material/grid-list';
// components
import { DashboardComponent } from './components/template/dashboard/dashboard.component';
import { SharedRoutingModule } from './shared-routing.module';
import { DemoComponent } from './components/demo/demo.component';

@NgModule({
  declarations: [
    DashboardComponent,
    DemoComponent,
  ],
  imports: [
    CommonModule,
    // Material modules
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatToolbarModule,
    // ---
    MatButtonModule,
    MatGridListModule,
    MatCardModule,
    MatMenuModule,
    // router last
    SharedRoutingModule,
    RouterOutlet
  ],
  exports: [
  ]

})
export class SharedModule {
}
