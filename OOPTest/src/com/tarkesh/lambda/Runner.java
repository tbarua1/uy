package com.tarkesh.lambda;

public class Runner {
public void run(Executable e){
	System.out.println("Executer");
	int value=e.execute(10);
	System.out.println("Return Value "+value);
	
}
}
