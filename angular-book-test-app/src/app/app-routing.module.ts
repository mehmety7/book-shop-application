import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {BookComponent} from "./features/book/pages/book.component";

const routes: Routes = [
  {
    path: 'book',
    component: BookComponent
  },
  {
    path: '',
    component: BookComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
