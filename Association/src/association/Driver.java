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
public class Driver extends Car{
    public String drivername;

    public Driver(String drivername, int carId, String carName) {
        super(carId, carName);
        this.drivername = drivername;
    }

    public Driver(String drivername) {
        this.drivername = drivername;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    @Override
    public String toString() {
        return "Driver{" + "drivername=" + drivername + '}';
    }
    
    
}
