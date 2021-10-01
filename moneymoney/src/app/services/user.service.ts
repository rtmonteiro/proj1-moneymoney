import { Injectable } from '@angular/core';
import {IUser} from '../models/user';
import {Observable} from 'rxjs';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  user: IUser;

  urlPath = environment.urlPath;
  httpHeader = environment.headers;

  constructor(private http: HttpClient) { }

  login(email: string, password: string): Observable<IUser> {
    return this.http.post<IUser>(`${this.urlPath}/user/login`, {email, password}, {
      headers: new HttpHeaders(this.httpHeader),
    });
  }
}
