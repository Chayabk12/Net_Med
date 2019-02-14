import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import {RouterModule} from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { BodyComponent } from './body/body.component';
import { CarouselModule } from 'ngx-bootstrap/carousel';
import { Pro2Component } from './pro2/pro2.component';
import { Pro3Component } from './pro3/pro3.component';
import { Pro4Component } from './pro4/pro4.component';
import { ProductPageComponent } from './product-page/product-page.component';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    BodyComponent,
    Pro2Component,
    Pro3Component,
    Pro4Component,
    ProductPageComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CarouselModule,
    RouterModule.forRoot([])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }