package io;
class Str1 {
	static int spacecount(String s) {
		int k = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++)
			if (ch[i] == ' ') {
				k = k + 1;
			}
		System.out.println("space  is:" + (k));
		return 0;
	}

	public static void main(String[] args) {
		new Str1();
		spacecount("you are most welcome");
	}
}
