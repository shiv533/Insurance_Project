import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { AppComponent } from './app/app.component';
import { UserLoginComponent } from './app/user-login/user-login.component';

bootstrapApplication(UserLoginComponent)
  .catch((err) => console.error(err));