import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import {DashboardComponent} from "./components/dashboard/dashboard.component";
import {LoginComponent} from "./components/login/login.component";
import {LiveQuotes} from "./components/livequotes/livequotes.component";
import {History} from "./components/history/history.component";
import { PageNotFoundComponent }  from './components/404/page-not-found.component';
import { LogoutComponent } from './components/logout/logout.component';

import { HomeComponent  }       from './home.component';

import { AuthGuard } from './services/auth_guard.service';

export const routes: Routes = [
  { path: '', redirectTo: '/home/dashboard/quoteslive', pathMatch: 'full' },
  {
    path: 'home',
    component: HomeComponent,
    canActivate:[AuthGuard],
    children:[  // Children paths are appended to the parent path
      { path: '', redirectTo: '/home/dashboard/quoteslive', pathMatch: 'full', data:[{selectedHeaderItemIndex:1, selectedSubNavItemIndex:-1}] },  // Default path (if no deep path is specified for home component like webui/home then it will by default show ProductsComponent )
      {
        path     : 'dashboard',
        component: DashboardComponent,
        data     : [{selectedHeaderItemIndex:0, selectedSubNavItemIndex:-1}],
        children :[
          { path: ''        , redirectTo: '/home/dashboard/quoteslive', pathMatch: 'full'},
          { path: 'quoteslive'   , component: LiveQuotes     , data:[{selectedHeaderItemIndex:0, selectedSubNavItemIndex:0}]  },
          { path: 'history' , component: History   , data:[{selectedHeaderItemIndex:0, selectedSubNavItemIndex:1}]  }
        ]
      },
      { path:'quoteslive'    , component: LiveQuotes      , data:[{selectedHeaderItemIndex:1, selectedSubNavItemIndex:-1}]  },
      { path:'history', component: History, data:[{selectedHeaderItemIndex:1, selectedSubNavItemIndex:-1}]  },
      // { path:'products'  , component: ProductsComponent    , data:[{selectedHeaderItemIndex:2, selectedSubNavItemIndex:-1}]  },
      // { path:'customers' , component: CustomersComponent   , data:[{selectedHeaderItemIndex:3, selectedSubNavItemIndex:-1}]  },
      // { path:'employees' , component: EmployeesComponent   , data:[{selectedHeaderItemIndex:4, selectedSubNavItemIndex:-1}]  },
    ]
  },
  { path: 'login' , component: LoginComponent       , data:[{selectedHeaderItemIndex:-1, selectedSubNavItemIndex:-1}] },
  { path: 'logout', component: LogoutComponent      , data:[{selectedHeaderItemIndex:-1, selectedSubNavItemIndex:-1}] },
  { path: '**'    , component: PageNotFoundComponent, data:[{selectedHeaderItemIndex:-1, selectedSubNavItemIndex:-1}] }
];
@NgModule({
  imports: [ RouterModule.forRoot(routes, {useHash:true} )],
  exports: [ RouterModule ],
  declarations:[PageNotFoundComponent]
})
export class AppRoutingModule {}


