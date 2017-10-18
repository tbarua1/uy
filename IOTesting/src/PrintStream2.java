	import java.io.*;
	
	class PrintStream2
  {
	public static void main(String str[])throws IOException
  {
	FileOutputStream fin=new FileOutputStream("abc.txt");
	PrintStream ps=new PrintStream(fin);
	System.setOut(ps);
	System.out.println("Hello java");
  }
  }