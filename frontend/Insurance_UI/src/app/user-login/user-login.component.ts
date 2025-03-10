import { Component } from '@angular/core';
import { HttpClient,HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-login',
  standalone: true,
  imports: [FormsModule, HttpClientModule], // <-- Add both FormsModule & HttpClientModule
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent {
  username: string = '';
  password: string = '';

  constructor(private http: HttpClient) {}

  loginUser() {
    const loginData = { username: this.username, password: this.password };
    this.http.post('http://localhost:8282/user/login', loginData, { responseType: 'text' }).subscribe({
      next: (response) => alert(response), // Now shows "Login successful"
      error: (error) => {
        console.error('Login error:', error); // Logs the actual error object
        alert('Login failed: ' + (error.error || 'Unknown error')); // Shows proper error message
      }
    });
  }
}
