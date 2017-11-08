/*
 It is the capability of data hiding, so that only user can 
interact with the 
only system to perform task, but user cant go inside the code. 
For example, when 
you consider the case of e-mail, complex details such as what happens as soon as 
you send an e-mail, the protocol your e-mail server uses are hidden from the user. 
Therefore, to send an e-mail you just need to type the content, mention the address 
of the receiver, and click send.
 */
package abstractionbyclass;

/**
 *
 * @author Abhishek.Sehgal
 */
public class AbstractionByClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal ab=new Animal() {
            @Override
            public void sound() {
                System.out.println("i am from base");}
        };
        ab.sound();
        ab.walk();
        Animal dog = new Dog();
	dog.sound();
        dog.walk();
        Animal cat = new Cat();
	cat.sound();
        cat.walk();
        System.out.println(dog instanceof Dog);
        Dog d=new Dog(); //Down casting Example
        d=(Dog) dog;
    }
    
}
