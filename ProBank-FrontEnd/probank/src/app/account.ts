import { Customer } from './customer';

export class Account 
{
    id:number;
    accountNumber:String;
    accountType:String;
    balance:number;
    branchId:String;
    customer:Customer;
}
