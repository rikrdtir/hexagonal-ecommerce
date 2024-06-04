import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.development';
import { Product } from '../interfaces/product';

const base_url = environment.API_URL

@Injectable({
  providedIn: 'root'
})


export class ProductService {

  constructor(private http: HttpClient) { }

  /**
  * get all products
  *
  * **/
  getProducts(): Observable<Product[]> {

    const endpoint = `${base_url}/admin/products`;
    return this.http.get<Product[]>(endpoint);

  }
  /**
  * Create product
  *
  * **/
  createProduct(formData: any): Observable<any> {
    const endpoint = `${base_url}/admin/products`;
    return this.http.post<Product>(endpoint, formData);
  }

  /**
  * Get product by id
  *
  * **/
  getProductById(id: number): Observable<Product> {

    const endpoint = `${base_url}/admin/products/${id}`;
    return this.http.get<Product>(endpoint);
  }


  /**
  * Create product
  *
  * **/
  deleteProductbyId(id: number): Observable<any> {

    const endpoint = `${base_url}/admin/products/${id}`;
    return this.http.delete(endpoint);
  }


}
