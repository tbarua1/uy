package io;

class Wrcnt {
	static void wordcount(String s) {
		int k = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				k = k + 1;
			}
		}
		System.out.println("total words are:" + (k + 1));
	}

	public static void main(String[] args) {
		new Wrcnt();
		wordcount(" hello this is a word count");
	}
}