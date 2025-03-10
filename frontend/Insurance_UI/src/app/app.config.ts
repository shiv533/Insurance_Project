import { provideRouter, Routes } from '@angular/router';
import { UserLoginComponent } from './user-login/user-login.component';

const routes: Routes = [
  { path: 'login', component: UserLoginComponent },
  { path: '', redirectTo: '/login', pathMatch: 'full' }
];

export const appConfig = {
  providers: [provideRouter(routes)]
};
