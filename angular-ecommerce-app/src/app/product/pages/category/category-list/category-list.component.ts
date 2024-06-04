import { Component, OnInit } from '@angular/core';
import { Category } from 'src/app/product/interfaces/category';
import { CategoryService } from 'src/app/product/services/category.service';

@Component({
  selector: 'app-category-list',
  templateUrl: './category-list.component.html',
  styleUrls: ['./category-list.component.css']
})

export class CategoryListComponent implements OnInit {

  categories: Category[] = [];
  displayedColumns: string[] = ['id', 'name', 'actions'];


  constructor(private categorySerice: CategoryService) { }

  ngOnInit(): void {
    this.categorySerice.getCategories().subscribe(
      (data) => {
        this.categories = data,
          console.log(data);


      }
    );

  }


}


