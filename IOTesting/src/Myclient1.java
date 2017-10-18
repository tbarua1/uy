/*		Serialization		*/

	import java.io.*;

	class Myclient1 implements Serializable
  {
	transient int a;//their value is not shown 
	static int b;   //their value is not shown
	String name;
	int age;	
	Myclient1(String name,int age,int a,int b)
  {
	//Assign the value in four variable

	this.name=name;
	this.age=age;
	this.a=a;
	this.b=b;
  }
  }
