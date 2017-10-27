/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.util.List;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Library {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" + "books=" + books + '}';
    }

    public Library(List<Book> books) {
        this.books = books;
    }
  
    List<Book> getTotalBooksInLibrary() {
         return books;  }
    
}
