import java.time.Year;
import java.util.Scanner;

public class Calulator {
    // creating addition method
    /* Always variable name, method name, class name and interface name must be meaningful */
    public void additionOfNumber(int num1, int num2){
        //local variable or parameters(num1 and num2 is parameter)/argument,
        System.out.println("Addition of "+num1+" and "+num2+ " is "+(num1+num2));
    }
    public void subtractionOfNumber(int num1, int num2){
        System.out.println("Subtraction of "+num1+" and "+num2+ " is "+(num1-num2));
    }
    public static void main(String[] args) {
        int x=0; // primitive data type
        Integer y=0; // Wrapper classes
        Scanner scanner=new Scanner(System.in);// system input stands for keyboard
        System.out.println("Please Enter a value of X");
        x=scanner.nextInt();
        System.out.println("Please enter a value of Y");
        y= scanner.nextInt();
        Calulator calulator = new Calulator(); // creating an object of class calculator
        calulator.additionOfNumber(x, y); // prameter/argument(x and y are argument) passing 
        calulator.subtractionOfNumber(x, y);
        scanner.close(); // resource reusability is importent
    }
}
