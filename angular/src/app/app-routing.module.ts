import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


import {LoginComponent} from "./components/login/login.component";

import { HomeComponent  }       from './home.component';

import { PageNotFoundComponent }  from './components/404/page-not-found.component';

import { AuthGuard } from './services/auth_guard.service';

export const routes: Routes = [
  { path: '', redirectTo: '/home/dashboard/order', pathMatch: 'full' },
  {
    path: 'home',
    component: HomeComponent,
    canActivate:[AuthGuard],
    children:[  // Children paths are appended to the parent path
      { path: '', redirectTo: '/home/dashboard/order', pathMatch: 'full', data:[{selectedHeaderItemIndex:1, selectedSubNavItemIndex:-1}] },  // Default path (if no deep path is specified for home component like webui/home then it will by default show ProductsComponent )
      {
        path     : 'dashboard',
        component: DashboardComponent,
        data     : [{selectedHeaderItemIndex:0, selectedSubNavItemIndex:-1}],
        children :[
          { path: ''        , redirectTo: '/home/dashboard/order', pathMatch: 'full'},
          { path: 'order'   , component: OrderStatsComponent     , data:[{selectedHeaderItemIndex:0, selectedSubNavItemIndex:0}]  },
          { path: 'product' , component: ProductStatsComponent   , data:[{selectedHeaderItemIndex:0, selectedSubNavItemIndex:1}]  }
        ]
      },
      // { path:'orders'    , component: OrdersComponent      , data:[{selectedHeaderItemIndex:1, selectedSubNavItemIndex:-1}]  },
      // { path:'orders/:id', component: OrderDetailsComponent, data:[{selectedHeaderItemIndex:1, selectedSubNavItemIndex:-1}]  },
      // { path:'products'  , component: ProductsComponent    , data:[{selectedHeaderItemIndex:2, selectedSubNavItemIndex:-1}]  },
      // { path:'customers' , component: CustomersComponent   , data:[{selectedHeaderItemIndex:3, selectedSubNavItemIndex:-1}]  },
      // { path:'employees' , component: EmployeesComponent   , data:[{selectedHeaderItemIndex:4, selectedSubNavItemIndex:-1}]  },
    ]
  },
  { path: 'login' , component: LoginComponent       , data:[{selectedHeaderItemIndex:-1, selectedSubNavItemIndex:-1}] },
  // { path: 'logout', component: LogoutComponent      , data:[{selectedHeaderItemIndex:-1, selectedSubNavItemIndex:-1}] },
  { path: '**'    , component: PageNotFoundComponent, data:[{selectedHeaderItemIndex:-1, selectedSubNavItemIndex:-1}] }
];
@NgModule({
  imports: [ RouterModule.forRoot(routes, {useHash:true} )],
  exports: [ RouterModule ],
  declarations:[PageNotFoundComponent]
})
export class AppRoutingModule {}


