import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FacebookModule} from "ngx-facebook";
import { FormsModule } from '@angular/forms';
import {HttpModule} from "@angular/http";
import {HttpClientModule, HttpClient} from '@angular/common/http';

import { LoginComponent } from './components/login/login.component';
import { StartComponent } from './components/startpage/startpage.component';
import { HomeComponent         } from './home.component';
import {AppRoutingModule} from "./app-routing.module";
import { AppComponent }       from './app.component';

import { AppConfig } from './app-config';
import { AuthGuard        } from './services/auth_guard.service';
import { UserInfoService  } from './services/user-info.service';
import { LoginService     } from './services/api/login.service';
import { ApiRequestService} from './services/api/api-request.service';
import { LiveQuotesService} from './services/api/livequotes.service';


import {DashboardComponent} from "./components/dashboard/dashboard.component";
import {History} from "./components/history/history.component";
import {LiveQuotes} from "./components/livequotes/livequotes.component";
import { LogoutComponent } from './components/logout/logout.component';
import {Carousel} from './components/carousel/carousel.component';
import {FreeQuotes} from './components/freequotes/freequotes.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    StartComponent,
    HomeComponent,
    DashboardComponent,
    LiveQuotes,
    History,
    LogoutComponent,
    Carousel,
    FreeQuotes
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    AppRoutingModule,
    FacebookModule.forRoot(),
    HttpClientModule
  ],
  providers: [
    AppConfig,
    AuthGuard,
    UserInfoService,
    LoginService,
    LiveQuotesService,
    ApiRequestService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
