package io;
class Stl {
	static int length(String s) {
		char ch[] = s.toCharArray();
		int k = 0;
		for (int i = 0; i < ch.length; i++) {
			k = k + 1;
		}
		System.out.println("length of string is:=" + k);
		return 0;
	}

	public static void main(String[] args) {
		length("this");
	}
}
