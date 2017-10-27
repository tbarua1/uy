/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aggregationandcomposition;

/**
 *
 * @author Abhishek.Sehgal
 */
public class AggregationAndComposition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Engine engine = new Engine();
         
        // Making a car with engine.
        // so we are passing a engine 
        // instance as an argument while
        // creating instace of Car.
        Car car = new Car(engine);
        car.move();
     
    }
    
}
