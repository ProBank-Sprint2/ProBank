import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  centered = false;
  disabled = false;
  unbounded = false;

  radius: number=100;
  color: string="white";

  constructor() { }

  ngOnInit(): void {
  }

}
