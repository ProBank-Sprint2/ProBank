import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Customer } from './customer';
import { Address } from './address';

@Injectable({
  providedIn: 'root'
})
export class UpdateserviceService 
{
  constructor(private _http:HttpClient) { }
  
  getAllcustomers():Observable<any>
  {
    let url = "http://localhost:3333/customers";
    return this._http.get(url);
  }
  getUgetcustomerByIDser(id:number):Observable<any>
  {
    let url = "http://localhost:3333/customers/"+id;
    return this._http.get(url);
  }
  getaddressBycustomerId(customerId:number):Observable<any>
  {
    let url = "http://localhost:3333/customers/"+customerId+"/addresses";
    return this._http.get(url);
  }
  updatec(id:number, customerUpdated:Customer):Observable<any>
  {
    let url = "http://localhost:3333/customers/"+id;
    return this._http.put(url, customerUpdated, {responseType:'text'});
  }
  updateaddress(addressesId:number, addressUpdated:Address):Observable<any>
  {
    let url = "http://localhost:3333/customers/"+addressesId;
    return this._http.put(url, addressUpdated, {responseType:'text'});
  }
}
