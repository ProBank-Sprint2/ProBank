import { Component, OnInit } from '@angular/core';
import { DisbursementserviceService } from '../disbursementservice.service';
import { LoanRequest } from '../loanrequest';
@Component({
  selector: 'app-loandisbursement',
  templateUrl: './loandisbursement.component.html',
  styleUrls: ['./loandisbursement.component.css']
})
export class LoandisbursementComponent implements OnInit {
  loanrequests:LoanRequest[]=[];
  data1:LoanRequest;
  constructor(private service:DisbursementserviceService) { }

  public delteLoanRequest(loanID:number){
    let resp= this.service.deleteLoanRequest(this.data1.loanId);
    //resp.subscribe((data)=>this.data1=data);
   }
   
   public findLoanRequestByaccountId(){
     let resp= this.service.getLoanRequestbyId(this.data1.loanId);
     resp.subscribe((data)=>this.loanrequests=data);
    }

    public putLoanRequest(){
      let resp= this.service.putLoanRequest(this.data1.loanId);
      resp.subscribe((data)=>this.loanrequests=data);
     }

  ngOnInit(): void {
    let resp=this.service.getLoanRequests();
    resp.subscribe((data)=>this.loanrequests=data);
  }

}
