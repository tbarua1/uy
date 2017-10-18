	
	import java.io.*;
	
	class PrintWriterclass
  {
	public static void main(String str[])throws IOException
  {	
	PrintWriter pw=new PrintWriter(new FileWriter("e://dcc//abcd.txt"));
	                     //PrintWriter pw=new PrintWriter("abc.txt" );
	pw.println("Hello");
	pw.println("Hye");
	pw.close();
  }
  }