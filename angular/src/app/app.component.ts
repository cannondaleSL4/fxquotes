import { Component } from '@angular/core';

@Component({
  moduleId: module.id,
  selector: 'app',
  templateUrl: './app.component.html',
})
export class AppComponent {
  title = 'spring boot and angular 4 secure authentication';
  static API_URL="http://localhost:9099";
}
