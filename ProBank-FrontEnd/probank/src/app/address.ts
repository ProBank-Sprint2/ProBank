import { Customer } from './customer';

export class Address 
{
    id:number;
    city:String;
    addressLine1:String;
    addressLine2:String;
    country:String;
    zipCode:String;
    customer:Customer;
}
