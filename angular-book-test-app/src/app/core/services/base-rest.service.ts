import {Injectable} from "@angular/core";
import {HttpClient, HttpParams} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: "root"
})
export class BaseRestService {
  constructor(private http: HttpClient) {}

  get<T>(url: string, params?: HttpParams): Observable<T> {
    if (params) {
      return this.http.get<T>(url, {params: params});
    } else {
      return this.http.get<T>(url);
    }
  }

}
