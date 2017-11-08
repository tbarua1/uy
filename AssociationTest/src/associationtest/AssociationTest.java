/*
 Association is relation between two separate classes which establishes through their Objects. Association can be one-to-one, one-to-many, many-to-one, many-to-many.
In Object-Oriented programming, an Object communicates to other Object to use functionality and services provided by that object. Composition and Aggregation are the two forms of association.
 */
package associationtest;

/**
 *
 * @author Abhishek.Sehgal 
 */
public class AssociationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Driver d=new Driver("Mr. Xyz", "Audi", 10);
        System.out.println(d+" "+d.carId+" "+d.carName);
    }
    
}
