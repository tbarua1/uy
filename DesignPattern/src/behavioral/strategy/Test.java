package behavioral.strategy;

public class Test {
	/*
	 * Strategy pattern is used when we have multiple algorithm for a specific
	 * task and client decides the actual implementation to be used at runtime.
	 * 
	 * Strategy pattern is also known as Policy Pattern. We defines multiple
	 * algorithms and let client application pass the algorithm to be used as a
	 * parameter. One of the best example of this pattern is Collections.sort()
	 * method that takes Comparator parameter. Based on the different
	 * implementations of Comparator interfaces, the Objects are getting sorted
	 * in different ways.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Context context = new Context(new OperationAdd());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationSubstract());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationMultiply());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	      
	      context = new Context(new OperationDivision());		
	      System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
	  
	}

}
/*
 * In Strategy pattern, a class behavior or its algorithm can be changed at run
 * time. This type of design pattern comes under behavior pattern.
 * 
 * In Strategy pattern, we create objects which represent various strategies and
 * a context object whose behavior varies as per its strategy object. The
 * strategy object changes the executing algorithm of the context object.
 */
