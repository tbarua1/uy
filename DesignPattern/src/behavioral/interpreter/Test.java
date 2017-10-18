package behavioral.interpreter;

public class Test {
	/*
	 * An Interpreter Pattern says that
	 * "to define a representation of grammar of a given language, along with an 
	 * interpreter that uses this representation to interpret sentences in the language"
	 * .
	 * 
	 * Basically the Interpreter pattern has limited area where it can be
	 * applied. We can discuss the Interpreter pattern only in terms of formal
	 * grammars but in this area there are better solutions that is why it is
	 * not frequently used.
	 * 
	 * This pattern can applied for parsing the expressions defined in simple
	 * grammars and sometimes in simple rule engines
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix = "a+b*c";

		InfixToPostfixPattern ip = new InfixToPostfixPattern();

		String postfix = ip.conversion(infix);
		System.out.println("Infix:   " + infix);
		System.out.println("Postfix: " + postfix);
	}
	/*
	 * Interpreter Pattern
	 * 
	 * is used to defines a grammatical representation for a language and
	 * provides an interpreter to deal with this grammar.
	 * 
	 * The best example of this pattern is java compiler that interprets the
	 * java source code into byte code that is understandable by JVM. Google
	 * Translator is also an example of interpreter pattern where the input can
	 * be in any language and we can get the output interpreted in another
	 * language.
	 */
}
