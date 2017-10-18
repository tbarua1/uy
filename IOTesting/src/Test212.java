import java.util.Scanner;
public class Test212 {
public static void main(String[] args) {
		/*
		Console c= System.console();
		System.out.println("Enter your Name:-");
		String nam=c.readLine();
		System.out.println(nam);
		System.out.println("Enter Your Password :-");
		char ch[]=c.readPassword();
		String pass=String.valueOf(ch);
		System.out.println("Password is:"+pass);
	}*/
		
	Scanner s=new Scanner(System.in);
	String nam=s.next();
	System.out.println(nam);
	
	Float f1=s.nextFloat();
	System.out.println(f1);
		
	Double d=s.nextDouble();
	System.out.println(d);
}}
