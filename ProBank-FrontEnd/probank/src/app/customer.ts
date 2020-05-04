import { Address } from './address';
import { Account } from './account';

export class Customer 
{
    id:number;
    aadhar:String;
    gender:String;
    panCard:String;
    contactNumber:String;
    dob:String;
    name:String;
    address:Address;
    account:Account;
}
