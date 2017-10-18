package com.tarkesh.anonymous;

public class Test {
public static void main(String[] args) {
	System.out.println("WelCome");
	Machine machine=new Machine(){
		@Override
		public void start(){
			System.out.println("I am at Main Method");
		}
	};
	machine.start();
	Plant plant=new Plant() {
		
		public void grow() {
			// TODO Auto-generated method stub
			System.out.println("Plant Growing");
		}
	};
	plant.grow();
}
}
