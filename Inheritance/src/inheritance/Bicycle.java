/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Bicycle {
     public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public Bicycle() {
    }
public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
         
    public void speedUp(int increment)
    {
        speed += increment;
    }
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "gear=" + gear + ", speed=" + speed + '}';
    }
    
}
