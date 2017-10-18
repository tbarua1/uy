package io;
class Charc {
	static int charcount(String s) {
		char[] ch = s.toCharArray();
		int chr = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				chr++;
			}
		}
		System.out.println("no. of char in the string is:" + chr);
		return chr;
	}

	public static void main(String[] args) {
		System.out.println(charcount("Hello How are you?"));
	}
}
