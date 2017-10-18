	import java.io.*;
	class Temp1
  {
	public static void main(String str[]) throws FileNotFoundException//throws IOException
  {
	FileOutputStream fin=new FileOutputStream("e://dcc//ddd.txt");
	PrintStream ps=new PrintStream(fin);
	System.setOut(ps);
	System.out.println("Hello java");
	

	//System.setErr(ps);
	//System.err.println("Hello Hey");
  }
  }