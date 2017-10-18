package io;
class Vowlc {
	static void vowelcount(String s) {
		char ch[] = s.toCharArray();
		int vowl = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				vowl = vowl + 1;
			}
		}
		System.out.println("no. of vowels in string is:=" + vowl);
		
	}

	public static void main(String[] args) {
		vowelcount("  hi hello how are you doing, Thank you ");
	}
}
