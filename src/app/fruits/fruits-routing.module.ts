import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateComponent } from './create/create.component';
import { EditComponent } from './edit/edit.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  
  {
    path: 'fruits/home',
    component: HomeComponent,
  },
  
  {
    path:'fruits/edit/:id',
    component: EditComponent
  },
  {
    path: 'fruits/create',
    component: CreateComponent,
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FruitsRoutingModule { }
