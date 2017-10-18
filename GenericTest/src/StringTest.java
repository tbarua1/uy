/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek.Sehgal
 */
public class StringTest {
    public static void main(String[] args) {
        String s="Tue 27-6 0:28-13:28";
        String[] split = s.split(" ");
        String[] split1 = split[1].split("-");
        System.out.println("Date "+split1[0]);
        System.out.println("Minute "+split1[1]);
         String[] split2 = split[2].split("-");
        String[] split3 = split2[0].split(":");
        System.out.println("Time Hour1 "+split3[0]);
         System.out.println("Time Minute1 "+split3[1]);
        String[] split4 = split2[1].split(":");
         System.out.println("Time Hour2 "+split4[0]);
         System.out.println("Time Minute2 "+split4[1]);
       
    }
}
