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
public class Car {
    private final Engine engine; // Composition
    //private Engine engine;     // Aggregation
     
    Car(Engine engine)
    {
        this.engine = engine;
    }
     
    // car start moving by starting engine
    public void move() 
    {
         
        //if(engine != null)
        {
            engine.work();
            System.out.println("Car is moving ");
        }
    }
}
