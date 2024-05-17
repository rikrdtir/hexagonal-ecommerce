import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from '../common/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private apiUrl: string = "http://localhost:8085/api/v1_1/admin/products"

  constructor(private httpClient: HttpClient) { }

  // Get all Products
  getProducts(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.apiUrl);
  }

  // Create Products
  createProduct(formData: any): Observable<any> {
    return this.httpClient.post<Product>(this.apiUrl, formData);
  }

  // Delete Product by id
  deleteProductById(id: number): Observable<any> {
    return this.httpClient.delete(this.apiUrl + "/" + id);
  }
  // Get Prodyct by id
  getProductById(id: number) {
    return this.httpClient.get<Product>(this.apiUrl + "/" + id);
  }
}
