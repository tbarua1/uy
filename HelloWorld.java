// package is a folder structure to manage java classes 
package com.tarkeshwar;
//This is my comments and comments are not a part of Java Programming, it is just for information only
// Keywords are displayed a blue color. the keywords can't be used as variable name
// public - private - protected - default are access modifier  
public class HelloWorld{
    // class is a blue print( drawing/ map) to define an object, there is no real existance, No memory allocation is needed in the classes. java class files are treated as a ordinary text file 
    public static void main(String[] args) {
       // String public ="Tarkeshwar Barua"; // no keyword used as variable name
       String myName="Dr Tarkeshwar Barua"; 
       //String constants are enclosed in double quotes, single quotes are not valid 
        System.out.println("Hello World ");
        System.out.println(myName);
        System.out.println("Hello "+myName+"\n i am learning \t Java Lanaguage");  // sout tab
        char grade='A'; // single quates is used to assign a character constant 
        Character grade1='B';
    }
}
