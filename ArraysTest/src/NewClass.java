
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abhishek.Sehgal
 */
public class NewClass {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        System.out.println(instance.get(Calendar.FRIDAY) + " " + instance.get(Calendar.MONTH) + " " + instance.get(Calendar.YEAR));
        // System.out.println(instance.);
        System.out.println(getDate(4));
    }

    public static String getDate(int day) {
        String weakDay = "";
        switch (day) {
            case 1:
                weakDay = "Sun";
                break;
            case 2:
                weakDay = "Mon";
                break;
            case 3:
                weakDay = "Tue";
                break;
            case 4:
                weakDay = "Wed";
                break;
            case 5:
                weakDay = "Thu";
                break;
            case 6:
                weakDay = "Fri";
                break;
            case 7:
                weakDay = "Sat";
                break;
        }
        return weakDay;
    }
}
