package io;

/* string reverse */
class Sttr {

	static String reverse(String s)
	{
		char ch[]=s.toCharArray();
		int k=0;
		String str="";
		for(int i=0;i<ch.length;i++)
		{
			str=str+ch[i];
		}
		return str;
	}
	public static void main(String[] args) {

		String s = reverse("this is a reverse string");
		System.out.println(s);
	}
}
