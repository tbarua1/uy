/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Library {

    private List<Book> books;
    private String libName;

    public Library() {
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public Library(List<Book> books, String libName) {
        this.books = books;
        this.libName = libName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.books);
        hash = 41 * hash + Objects.hashCode(this.libName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Library other = (Library) obj;
        if (!Objects.equals(this.libName, other.libName)) {
            return false;
        }
        if (!Objects.equals(this.books, other.books)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Library{" + "books=" + books + ", libName=" + libName + '}';
    }

    List<Book> getTotalBooksInLibrary() {
        return books;
    }

}
