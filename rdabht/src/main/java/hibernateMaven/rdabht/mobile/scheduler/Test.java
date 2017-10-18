/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.scheduler;

import java.util.Date;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Test {
    public static void main(String[] args) {
        String d="15:00:00";
  
        System.out.println(d.split(":")[0]+" "+d.split(":")[1]);
        long parse = Date.parse(d);
        Date date=new Date(parse);
        System.out.println(date+" "+new Date());
    }
}
