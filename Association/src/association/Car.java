/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package association;

/**
 *
 * @author uys41
 */
public class Car {
    private int carId;
    private String carName;

    public Car(int carId, String carName) {
        this.carId = carId;
        this.carName = carName;
    }

    public Car() {
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" + "carId=" + carId + ", carName=" + carName + '}';
    }
    
}
