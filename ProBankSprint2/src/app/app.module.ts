import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule} from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoanrequestComponent } from './loanrequest/loanrequest.component';
import { LoandisbursementComponent } from './loandisbursement/loandisbursement.component';

@NgModule({
  declarations: [
    AppComponent,
    LoanrequestComponent,
    LoandisbursementComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
