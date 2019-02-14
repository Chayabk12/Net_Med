import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

@NgModule({

  exports: [ RouterModule ]
})


export class AppRoutingModule { 

}

import { HeaderComponent }      from './header/header.component';

const routes: Routes = [
  { path: 'header', component: HeaderComponent }
];


