package io;
class Rvs {
	static void reverce(String s) {

		char ch[] = s.toCharArray();
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		
		reverce("this is reverse program");
	}
}