  	//Scanner
	import java.io.*;
	import java.util.*;
	class MyScanner
  {
	public static void main(String str[])throws IOException
  {
	Scanner s=new Scanner(System.in);
	String s1=" ";
	int i=s.nextInt();
	double d=s.nextDouble();
	long l=s.nextLong();
	float f=s.nextFloat();
	System.out.println(i+d+f+l);
	/*while(!s1.equals("stop"))
  {
	s1=s.nextLine();
	System.out.println(s1);*/
  }
  }
  