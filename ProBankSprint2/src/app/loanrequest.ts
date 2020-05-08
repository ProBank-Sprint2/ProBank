export class LoanRequest{
   
    loanId:number;
    amount:number;
    tenure:number;
    creditScore:number;
    roi:number;
    loanType:string;
    loanDisbursementStatus:string;
    
constructor(loanId:number,amount:number,tenure:number,creditScore:number,roi:number,loanType:string,loanDisbursementStatus:string)
{
    this.loanId=loanId;
    this.amount=amount;
    this.tenure=tenure;
    this.creditScore=creditScore;
    this.roi=roi;
    this.loanType=loanType;
    this.loanDisbursementStatus=loanDisbursementStatus;

}
}
