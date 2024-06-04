import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.development';
import { Category } from '../interfaces/category';

const base_url = environment.API_URL

@Injectable({
  providedIn: 'root'
})


export class CategoryService {

  constructor(private http: HttpClient) { }

  /**
  * get all categories
  *
  * **/
  getCategories(): Observable<Category[]> {

    const endpoint = `${base_url}/admin/categories`;
    return this.http.get<Category[]>(endpoint);

  }
}
