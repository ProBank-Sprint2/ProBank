import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';


import { LoandisbursementComponent } from './loandisbursement/loandisbursement.component';
import { LoanrequestComponent } from './loanrequest/loanrequest.component';


const routes: Routes = [
  {path:"",redirectTo:"loanregister",pathMatch:"full"},
  {path:"loanregister",component:LoanrequestComponent},
  {path:"searchApprovel",component:LoandisbursementComponent},
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
