import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


import {LoginComponent} from "./components/login/login.component";

import { HomeComponent  }       from './home.component';

import { PageNotFoundComponent }  from './components/404/page-not-found.component';

export const routes: Routes = [
  { path: '', redirectTo: '/home/dashboard/order', pathMatch: 'full' }
];
@NgModule({
  imports: [ RouterModule.forRoot(routes, {useHash:true} )],
  exports: [ RouterModule ],
  declarations:[PageNotFoundComponent]
})
export class AppRoutingModule {}


