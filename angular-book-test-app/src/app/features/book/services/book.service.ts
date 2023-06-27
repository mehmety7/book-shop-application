import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {Book} from "../../../core/models/book";
import {BaseRestService} from "../../../core/services/base-rest.service";
import {Endpoints} from "../../../core/constants/endpoints";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private restService: BaseRestService) { }

  getBook(id: number): Observable<Book> {
    return this.restService.get(Endpoints.BOOK + "/" + id);
  }

  getBooks(): Observable<Array<Book>> {
    return this.restService.get(Endpoints.ALL_BOOKS)
  }

}
