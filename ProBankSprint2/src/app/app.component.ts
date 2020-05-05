import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'LoanRequest';

  //object to save the response
  myresponse:any;

  //url to fetch data from spring
APP_URL="http://localhost:1313";


}
