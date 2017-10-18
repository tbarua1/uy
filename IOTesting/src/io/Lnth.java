package io;

class Lnth {
	static void length(String s) {
		int k = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			k = k + 1;
		}
		System.out.println("length of program is:" + (k));
	}

	public static void main(String[] args) {

		length("    its a length count program");
	}
}