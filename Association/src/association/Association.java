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
public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Driver driver=new Driver("Mr xyz", 100, "BMW");
        System.out.println("Driver Name - "+driver.getDrivername());
        System.out.println("Car Name - "+driver.getCarName());
        System.out.println("Car ID - "+driver.getCarId());
        driver.setCarId(200);
        driver.setCarName("Audi");
        driver.setDrivername("Mr ABC");
        System.out.println("Driver Name - "+driver.getDrivername());
        System.out.println("Car Name - "+driver.getCarName());
        System.out.println("Car ID - "+driver.getCarId());   
    }
    
}
