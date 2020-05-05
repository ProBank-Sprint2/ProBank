import { Loan } from './loan';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DisbursementserviceService {
  constructor(private http:HttpClient) { }

  public doRegistration(loan:Loan):Observable<any>{

    alert(loan.loanId)
    return this.http.post("http://localhost:1199/loan/add",loan,{responseType:'text' as 'json'});
  }

  getLoanRequests():Observable<any>{
    return this.http.get("http://localhost:1199/loan");
  }

  getLoanRequestsByLoanId(loanId:number):Observable<any>{
    alert(loanId)
    return this.http.get("http://localhost:1199/loan/"+loanId);
  }
  
   public putLoanRequests(loanrequest):Observable<any> {
    return this.http.put("http://localhost:1199/loan/modify",loanrequest,{responseType:'text' as 'json'});
    
  }
  
  public deleteLoanRequests(loanId:number):Observable<any> {
    alert(loanId)
    return this.http.delete("http://localhost:1199/loan/delete/"+loanId);
  }


}

