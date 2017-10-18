package io;
class Spcc {
	static int spacecount(String s) {
		char ch[] = s.toCharArray();
		int k = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				k = k + 1;
			}
		}
		System.out.println("No. of space in the string is: " + k);
		return 0;
	}

	public static void main(String... args) {
		spacecount("   Hello i m tarun    ");
	}
}
