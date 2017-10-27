/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associationtest;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Driver extends Car{
    String driverName;

    public Driver(String carName, int carId) {
        super(carName, carId);
    }
    public Driver(String driverName,String carName, int carId) {
        super(carName, carId);
        this.driverName=driverName;
    }

    @Override
    public String toString() {
        return "Driver{" + "driverName=" + driverName + '}';
    }
    
}
