import { Component, OnInit } from '@angular/core';
import { DisbursementserviceService } from '../disbursementservice.service';
@Component({
  selector: 'app-loandisbursement',
  templateUrl: './loandisbursement.component.html',
  styleUrls: ['./loandisbursement.component.css']
})
export class LoandisbursementComponent implements OnInit {
  loanrequests:any[]=[];
  loan:any;
  loanId:number;
  constructor(private service:DisbursementserviceService) { }

  public deleteLoanRequest(loan){ 
    let resp= this.service.deleteLoanRequests(loan.loanId)
    resp.subscribe((data)=>this.loanrequests=data);
   }
   
   public findLoanRequestByaccountId(){
     let resp= this.service.getLoanRequestsByLoanId(this.loanId);
     resp.subscribe((data)=>this.loanrequests=data);
    }

    public putLoanRequest(){
      let resp= this.service.putLoanRequests(this.loan);
      resp.subscribe((data)=>this.loanrequests=data);
     }

  ngOnInit(): void {
    let resp=this.service.getLoanRequests();
    resp.subscribe((data)=>this.loanrequests=data);
  }

}
