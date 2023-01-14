import {Component, OnInit} from '@angular/core';
import {BookService} from "../services/book.service";
import {Book} from "../models/book";

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.scss']
})
export class BookComponent implements OnInit {

  book: Book = new Book();
  books: Array<Book> = new Array<Book>();

  constructor( private bookService: BookService ) {}

  ngOnInit(): void {
    this.bookService.getBook().subscribe(data => this.book = data);
    this.bookService.getBooks(10).subscribe(data => this.books = data);
  }
}
