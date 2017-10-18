 	//FileOutputStream

	import java.io.*;
	class MyFileWriter
  {
	public static void main(String str[])throws IOException
  {
	FileOutputStream fos=new FileOutputStream("e://dcc//abc.txt")	;
	String s="Good country in world";
	byte ch[]=s.getBytes();
	for(int i=0;i<ch.length;i++)
   	fos.write(ch[i]);
	fos.close();
  }
  }
	