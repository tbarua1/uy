/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.lambda;

/**
 *
 * @author Abhishek.Sehgal
 */
public class Lambda {
    final static String salutation = "Hello! ";
   
   public static void main(String args[]){
      GreetingService greetService1 = message -> 
      System.out.println(salutation + message);
      greetService1.sayMessage("Friends");
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
    
}
