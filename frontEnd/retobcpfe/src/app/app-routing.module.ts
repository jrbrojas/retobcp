import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { KambistaComponent } from './kambista/kambista.component';

const routes: Routes = [

  { path: '', component: KambistaComponent }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
