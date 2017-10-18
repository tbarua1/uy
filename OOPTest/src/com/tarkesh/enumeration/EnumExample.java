package com.tarkesh.enumeration;

public class EnumExample {
enum Org{
	GOOGLE,YAHOO,Microsoft,apple
}
Org orgnization;

	public EnumExample(Org orgnization) {
	super();
	this.orgnization = orgnization;
}
	void getOrgnization(){
		switch (orgnization) {
		case GOOGLE:
			System.out.println("I am from Google");
			break;
		case YAHOO:
			System.out.println("I am from Yahoo");
			break;
		case Microsoft:
			System.out.println("I am from Google");
			break;
		case apple:
			System.out.println("I am from Apple");
			break;
		default:
			System.out.println("I am Unemployeed ");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EnumExample e1=new EnumExample(Org.GOOGLE);
e1.getOrgnization();
	}

}
