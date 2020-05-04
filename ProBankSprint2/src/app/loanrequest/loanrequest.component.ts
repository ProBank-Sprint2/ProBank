import { Component, OnInit } from '@angular/core';
import { DisbursementserviceService } from '../disbursementservice.service';
import { LoanRequest } from '../loanrequest';

@Component({
  selector: 'app-loanrequest',
  templateUrl: './loanrequest.component.html',
  styleUrls: ['./loanrequest.component.css']
})
export class LoanrequestComponent implements OnInit {
  loanrequest: LoanRequest[]=[];
  message:any;
 data:LoanRequest;
  constructor(private service:DisbursementserviceService) { }

  

  ngOnInit(): void {
    
  }
  public registerNow(){
    let resp=this.service.doRegistration(this.loanrequest);
    resp.subscribe((data)=>this.message=data);
      }

}
