import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/product/interfaces/product';
import { ProductService } from 'src/app/product/services/product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})

export class ProductListComponent implements OnInit {

  products: Product[] = [];
  displayedColumns: string[] = ['id', 'name', 'description', 'code', 'price', 'urlImage', 'actions'];


  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.productService.getProducts().subscribe(
      (data) => {
        this.products = data,
          console.log(data)
      }

    );

  }


}
