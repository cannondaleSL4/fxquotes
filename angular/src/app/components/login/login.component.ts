import {Component, OnInit, ViewEncapsulation, OnDestroy} from '@angular/core';
import { LoginService } from '../../services/api/login.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
})
export class LoginComponent implements OnInit, OnDestroy {
  model: any = {};
  errMsg:string = '';
  constructor(
    private router: Router,
    private loginService: LoginService) { }

  ngOnInit(): void {
    this.loginService.logout(false);
    const body = document.getElementsByTagName('body')[0];
    body.classList.add('text-center', 'log');
  }
  ngOnDestroy() {
    const body = document.getElementsByTagName('body')[0];
    body.classList.remove('text-center', 'log');
  }

  login() {
    this.loginService.getToken(this.model.username, this.model.password)
      .subscribe(resp => {
          if (resp.user === undefined || resp.user.token === undefined || resp.user.token === "INVALID" ){
            // this.errMsg = 'Username or password is incorrect';
            console.log("user or password is incorrect " + this.model.username + " " + this.model.password);
            return;
          }
          console.log("user and password is correct");
          this.router.navigate([resp.landingPage]);
        },
        errResponse => {
          switch(errResponse.status){
            case 401:
              this.errMsg = 'Username or password is incorrect';
              break;
            case 404:
              this.errMsg = 'Service not found';
            case 408:
              this.errMsg = 'Request Timedout';
            case 500:
              this.errMsg = 'Internal Server Error';
            default:
              this.errMsg = 'Server Error';
          }
        }
      );
  }
  //
  // onSignUp(){
  //   this.router.navigate(['signup']);
  // }
}
