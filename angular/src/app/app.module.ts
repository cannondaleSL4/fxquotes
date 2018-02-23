import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FacebookModule} from "ngx-facebook";
import { FormsModule } from '@angular/forms';
import {HttpModule} from "@angular/http";

import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent         } from './home.component';
import {routing} from "./app-routing.module";

import { AppConfig } from './app-config';
import { AuthGuard        } from './services/auth_guard.service';
import { UserInfoService  } from './services/user-info.service';
import { LoginService     } from './services/api/login.service';
import { ApiRequestService} from './services/api/api-request.service';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
  ],
  imports: [
    BrowserModule,HttpModule,FormsModule,routing, FacebookModule.forRoot(),
  ],
  providers: [
    AppConfig,
    AuthGuard,
    UserInfoService,
    LoginService,
    ApiRequestService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
