package io;
class Spcnt {
	static int spacecount(String s) {
		int k = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				k = k + 1;
			}
		}
		System.out.println("total  spaces are:" + k+5);
		return 0;
	}

	public static void main(String[] args) {
		int i=20;
		String s="xyz";
		System.out.println(20+s);
		
		spacecount("           hi     i am tarun rathi");
	}
}
