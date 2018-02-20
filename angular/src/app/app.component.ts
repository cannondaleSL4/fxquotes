import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template : '<router-outlet></router-outlet>',
  // templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'spring boot and angular 4 secure authentication';
  static API_URL="http://localhost:9099";
}
