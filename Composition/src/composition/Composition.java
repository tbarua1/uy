/*
 Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.

    It represents part-of relationship.
    In composition, both the entities are dependent on each other.
    When there is a composition between two entities, the composed object cannot exist without the other entity.

 */
package composition;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Abhishek.Sehgal
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Book b1 = new Book("EffectiveJ Java", "Joshua Bloch");
        Book b2 = new Book("Thinking in Java", "Bruce Eckel");
        Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");
         
        // Creating the list which contains the 
        // no. of books.
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
         
        Library library = new Library(books);
         
        List<Book> bks = library.getTotalBooksInLibrary();
        for(int i=0;i<bks.size();i++){
            System.out.println(bks.get(i));
        }
//        bks.forEach((Book bk) -> {
//            System.out.println(bk);
//         });
    }
    
}
