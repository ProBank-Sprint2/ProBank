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
  update(id:number)
  {
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
  cancel()
  {
    this.flag3 = true;
  }
  hideAddress()
  {
    this.flag4 = true;
  }
  showAddress(id:number)
  {
    this.flag4 = false;
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
      this.loadData();
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

// import { Component, ViewChild } from '@angular/core';
// import { ClassStruct } from './class-struct';
// import { ServiceComponentService } from './service-component.service';
// import { NgForm } from '@angular/forms';
// import { Router } from '@angular/router';


// @Component({
//   selector: 'app-root',
//   templateUrl: './app.component.html',
//   styleUrls: ['./app.component.css']
// })
// export class AppComponent 
// {
//   temp:any="";
//   title = 'probank';
//   field:String;
//   emp1:ClassStruct = new ClassStruct();
//   prods:ClassStruct[];
//   flag:boolean = false;
//   flag1:boolean = true;
//   flag3:boolean = true;
//   constructor( private acter:ServiceComponentService, private route:Router ) {}
//   @ViewChild("formdata")
//   form: NgForm;
//   ngOnInit():void 
//   {
//     this.acter.getProducts().subscribe((data) => this.prods = data);
//   }
//   selectedField(str:String)
//   {
//     this.field = str;
//   }
//   home()
//   {
//     this.acter.getProducts().subscribe((data) => this.prods = data);
//     this.flag1=true;
//     this.flag3=true;
//   }
//   add()
//   {
//     if(this.flag === false )
//     {
//       this.flag = true;
//     }
//     else
//     {
//       this.flag = false;
//     }
//   }
//   submit()
//   {
//     this.prods.push(this.emp1);
//     alert('Data added');
//     this.emp1 = new ClassStruct();
//     this.form.resetForm();
//   }
//   remove(prodId:number)
//   {
//     //this.prods = this.prods.filter( p => p.id != prodObj);
//     this.prods.splice(prodId,1);
//     alert("Data deleted");
//   }
//   update(prodId:number)
//   {
//     this.flag3 = false;
//     this.prods = this.acter.updateReq(this.prods,prodId);
//     if( this.flag1 === true )
//     {
//       this.flag1 = false;
//     }
//     this.acter.getProds();
//   }
//   cancel()
//   {
//     if( this.flag1 === false )
//     {
//       this.flag1 = true;
//     }
//     this.flag3 = true;
//     this.flag=false;
//   }
// }