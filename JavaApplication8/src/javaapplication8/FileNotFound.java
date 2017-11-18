/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author uys41
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Arrays;

public class FileNotFound {

    void abc(int w) throws ArithmeticException
              {
                  int x = w/0;
                  System.out.print("abc throw1...");
                  throw new ArithmeticException();
                  
                
              }
    
     public static void main(String args[]) {
      FileReader fr = null;
        FileNotFound f= new FileNotFound();
        
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f',
            'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        
     char[] copyTo = new char[7];
     System.arraycopy(copyFrom, 2, copyTo, 0, 7);
     System.out.println(Arrays.toString(copyTo));
     
     //   0  1 2
     //   5  4 6
     //   10 5 4
        
        int s1[][] = new int[3][3];
        int s2[][] = {{0,1,2},{5,4,6},{10,5,4}};
        
        for(int d=0; d<s2.length; d++)
        {
            for (int e=0; e<s2.length; e++)
            {
                 System.out.print(s2[d][e]+" ");                 
            }
            System.out.println();
           
        }
        
        int[] intArray1 = new int[5];
        int[] intArray2 = {1,5,0,5,4};
        //intArray1[0]=2;
        //intArray1[1]=5;
        for (int q=0; q<intArray1.length;q++)
        {
            intArray1[q]=q+2;
            
            System.out.println("intArray1: "+intArray1[q]);
            
            intArray1[q]=intArray1[q]+2;
            
            System.out.println("\nintArray: "+intArray1[q]);
        }
        System.out.println("test: "+intArray1.length);
        
        
        
        try
        {
        f.abc(4);
        }
        catch(ArithmeticException t){
        System.out.print("abc throw2...");
        }
      
      try {
         File file = new File("file.txt");
         fr = new FileReader(file); char [] a = new char[50];
         fr.read(a);   // reads the content to the array
         for(char c : a)
         System.out.println(c);   // prints the characters one by one
      }catch(IOException e) {
         e.printStackTrace();
      }finally {
         try {
            fr.close();
         }catch(IOException ex) {		
            ex.printStackTrace();
         }
      }
      
      try{
        int y=6;
      int z= y/0;
      System.out.println("Value of z = "+z);  
      }
      catch(Exception e){
          System.out.println(e.toString()); 
      }
      
      
     
   }

}

