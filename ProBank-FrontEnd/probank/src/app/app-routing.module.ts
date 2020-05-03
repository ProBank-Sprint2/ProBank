import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UpdatecustomerComponent } from './updatecustomer/updatecustomer.component';

const routes: Routes = [ {path: 'update', component:UpdatecustomerComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponent =[ UpdatecustomerComponent ]