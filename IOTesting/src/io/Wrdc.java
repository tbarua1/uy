package io;

class Wrdc {
	/*
	 * { static int wordcount(String s) { char ch[]=s.toCharArray(); int k=0;
	 * for(int i=0;i<ch.length;i++) { if(ch[i]== ' ' ) { k=k+1; } }
	 * System.out.println("No. of word count is: k=" +(k+1)); return 0; }
	 */
	static int wordCount(String s) {
		char ch[] = s.toCharArray();
		int word = 1;
		if (ch[0] == ' ')
			word = 0;
		for (int i = 0; i < ch.length; i++)
			if (i < ch.length - 1)

				if (ch[i] == ' ' && ch[i + 1] != ' ')
					word++;

		return word;
	}

	public static void main(String[] args) {
		int a = Wrdc.wordCount("  hello   How are you     ");
		System.out.println(a);
	}
}
