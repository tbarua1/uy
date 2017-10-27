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
public class MountainBike extends Bicycle{
     public int seatHeight;

    public MountainBike(int seatHeight, int gear, int speed) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public MountainBike(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public MountainBike() {
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
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
        return super.toString()+" MountainBike{" + "seatHeight=" + seatHeight + '}';
    }
     
}
