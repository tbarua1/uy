package io;

/** char count **/
class Strin2 {
	static void charcount(String s) {
		int k = 0;

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				k = k + 1;
			}
		}
		int l = s.length() - k;
		System.out.println("total characters are:" + (l));
	}

	public static void main(String[] args) {
		
		charcount("       hi          i am tarun");
	}
}