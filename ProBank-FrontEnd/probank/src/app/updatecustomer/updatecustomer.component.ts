import { Component, OnInit, ViewChild } from '@angular/core';
import { UpdateserviceService } from '../updateservice.service';
import { Customer } from '../customer';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Address } from '../address';

@Component({
  selector: 'app-updatecustomer',
  templateUrl: './updatecustomer.component.html',
  styleUrls: ['./updatecustomer.component.css']
})
export class UpdatecustomerComponent implements OnInit {

  constructor(private service:UpdateserviceService, private route:Router ) { }

  flag3:boolean = true;
  flag4:boolean = true;
  flag5:boolean = true;
  @ViewChild("formdata")
  form: NgForm;
  cust:Customer[];
  tempCust:Customer;
  tempAddress:Address;
  id:number;
  ngOnInit(): void 
  {
    this.service.getAllcustomers().subscribe(data=>
      {
        this.cust = data;
      },
      error=>{
        alert("error occured while subscribing data from server");
        console.log("error occured while subscribing data from server");
      });
  }
  updateCustomer(id:number)
  {
    this.cancelUpdatingAddress();
    this.flag3 = false;
    this.id = id;
    this.service.getUgetcustomerByIDser(this.id).subscribe(data=>
      {
        this.tempCust = data;
      },
      error=>{
        alert("error occured while fetching data from server for a perticular ID");
        console.log("error occured while fetching data from server for a perticular ID");
      });
  }
  fetchAddress(id:number)
  {
    this.cancelUpdate();
    this.flag5 = false;
    this.id = id;
    this.service.getUgetcustomerByIDser(this.id).subscribe(data=>
      {
        this.tempCust = data;
      },
      error=>{
        alert("error occured while fetching data from server for a perticular ID");
        console.log("error occured while fetching data from server for a perticular ID");
      });
    this.service.getaddressBycustomerId(this.id).subscribe(data=>
      {
        this.tempAddress = data;
      },
      error=>{
        alert("error occured while fetching data from server for a perticular ID");
        console.log("error occured while fetching data from server for a perticular ID");
      });
  }
  cancelUpdatingAddress()
  {
    this.flag5 = true;
  }
  cancelUpdate()
  {
    this.flag3 = true;
  }
  submitFunc()
  {
    console.log(this.tempCust);
    console.log(this.tempCust.name);
    console.log(this.tempCust.id);
    this.service.updatec(this.id,this.tempCust).subscribe(data=>
      {
        alert("Updated Successfully");
      },
      error=>{
        alert("error occured while sending data to the server for a perticular ID");
        console.log("error occured while sending data to the server for a perticular ID");
      });
      this.route.navigate(["/"]);
  }
  submitFunc2()
  {
    console.log(this.tempCust);
    console.log(this.tempAddress);
    this.service.updateaddress(this.id,this.tempAddress).subscribe(data=>
      {
        alert("Updated Successfully");
      },
      error=>{
        alert("error occured while sending data to the server for a perticular ID");
        console.log("error occured while sending data to the server for a perticular ID");
      });
      this.route.navigate(["/"]);
  }
  loadData()
  {
    this.service.getAllcustomers().subscribe(data=>
      {
        this.cust = data;
      },
      error=>{
        alert("error occured while subscribing data from server");
        console.log("error occured while subscribing data from server");
      });
  }
}