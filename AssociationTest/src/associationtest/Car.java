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
public class Car {
    String carName;
   int carId;

    public Car(String carName, int carId) {
        this.carName = carName;
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Car{" + "carName=" + carName + ", carId=" + carId + '}';
    }
   
}
