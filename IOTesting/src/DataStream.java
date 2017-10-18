 	//Line by line read the data and put into the file
  
	//DataInputStream and DataOutputStream

	import java.io.*;
	
	class DataStream
  {
	public static void main(String str[]) throws IOException
  {
	DataInputStream din=new DataInputStream(System.in);
	FileOutputStream fout=new FileOutputStream("e://dcc//abc.txt");
	DataOutputStream dout=new DataOutputStream(fout);
	//PrintStream dout=new PrintStream(fout);
	String s1=" ";
	while(!s1.equals("stop"))
  {
	s1=din.readLine();
	System.out.println(s1);
	//dout.writeUTF(s1); 
	//dout.writeChars(s1);
	dout.writeBytes(s1);
	//dout.println(s1);
	dout.flush();
  }
	din.close();
	dout.close();
  }
  }