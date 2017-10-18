package com.tarkesh.lambda;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner = new Runner();
		runner.run(new Executable() {
			@Override
			public int execute(int a) {
				// TODO Auto-generated method stub
				System.out.println("Class Overriden Methd");
				return 7+a;
			}
		});
		System.out.println("Main");
                runner.run((a) -> {
                    return 0; //To change body of generated lambdas, choose Tools | Templates.
                });
//		runner.run((a) -> {
//			System.out.println("Lambda Expression Here");
//			return 6+a;
//		});
	}

}
