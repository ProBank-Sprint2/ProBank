import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DisbursementserviceService {
  constructor(private http:HttpClient) { }

  public doRegistration(loanrequest){
    return this.http.post("http://localhost:1213/loan/add",loanrequest,{responseType:'text' as 'json'});
  }

  getLoanRequests(){
    return this.http.get("http://localhost:1213/loan");
  }

  getLoanRequestsByLoanId(){
    return this.http.get("http://localhost:1213/loan/loanId");
  }
  
   public putLoanRequests() {
    return this.http.put("http://localhost:1213/loan/modify");
    
  }
  
  public deleteLoanRequests(loanId) {
    return this.http.delete("http://localhost:1213/loan/loanId");
  }


}

