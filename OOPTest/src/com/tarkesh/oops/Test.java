package com.tarkesh.oops;

public class Test implements Animal{
static void main(String[] args) {
	
}

@Override
public void eat() {
	// TODO Auto-generated method stub
	System.out.println("Mammal eats");
}

@Override
public void travel() {
	// TODO Auto-generated method stub
	System.out.println("Mammal walk");
}
public int noOfLegs() {
    return 0;
 }
}
