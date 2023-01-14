import {Injectable} from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";
import {Book} from "../models/book";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private readonly BASE_URL = 'http://localhost:8080/api/';

  constructor(private http: HttpClient) { }

  getBook(): Observable<Book> {
    return this.http.get<Book>(this.BASE_URL + 'book');
  }

  getBooks(count: Number): Observable<Array<Book>> {
    let params = new HttpParams();
    params.append("count", count.toString());
    return this.http.get<Array<Book>>(this.BASE_URL + 'books', {params: params})
  }

}
