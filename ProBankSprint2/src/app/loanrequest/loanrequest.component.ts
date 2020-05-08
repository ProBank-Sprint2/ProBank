import { Component, OnInit } from '@angular/core';
import { DisbursementserviceService } from '../disbursementservice.service';
import { Loan } from '../loan';


@Component({
  selector: 'app-loanrequest',
  templateUrl: './loanrequest.component.html',
  styleUrls: ['./loanrequest.component.css']
})
export class LoanrequestComponent implements OnInit {

  message:any;
  loan:Loan=new Loan(0,0,0,0,0,'','');
  constructor(private service:DisbursementserviceService) { }

  

  ngOnInit(): void {
    
  }

  public registerNow(){
    let resp=this.service.doRegistration(this.loan);
    resp.subscribe((data)=>this.message=data);
  }

}