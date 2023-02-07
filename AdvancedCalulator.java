import java.util.Scanner;

public class AdvancedCalulator {
    // creating instance variable
    //private Integer num1, num2;  // this practice not good
    private static Integer num1;
    private static Integer num2;
    // Creatinf default constructor
    public AdvancedCalulator(){

    }
    // creating parameterized constructor 
    public AdvancedCalulator(Integer num1, Integer num2){
        this.num1=num1; // this.num1 represents instance variable while num1 represents local variable or parameter
        this.num2=num2;
    }
    // Creating methods there is not functions available in java
    public void additionOfNumber(){
        //local variable or parameters(num1 and num2 is parameter)/argument,
        System.out.println("Addition of "+this.num1+" and "+this.num2+ " is "+(this.num1+this.num2));
    }
    // written in the class known as method but out side of class known as function
    public void subtractionOfNumber(){
        System.out.println("Subtraction of "+this.num1+" and "+this.num2+ " is "+(this.num1-this.num2));
    }
    public Integer multipication(){
        return this.num1*this.num2;
    }
    public static Integer division(){
        return num1/num2;
    }
    public  Integer modulo(){
        return num1%num2;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a value of X");
       Integer x=scanner.nextInt();
        System.out.println("Please enter a value of Y");
        Integer y= scanner.nextInt();
        AdvancedCalulator calulator = new AdvancedCalulator(x,y);
        calulator.additionOfNumber(); // calling method
        calulator.subtractionOfNumber();
        Integer result =calulator.multipication();
        System.out.println("Multiplication : "+result);
        System.out.println("Division: "+AdvancedCalulator.division()); // without creating object we can access methods of a 
        System.out.println(calulator.modulo());
    }
}
