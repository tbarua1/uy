	//FileInputStream

	import java.io.*;
	class MyFileReader
  {
	public static void main(String str[])throws IOException
  {
	FileInputStream fis=new FileInputStream("e://dcc//abc.txt");
	int i=0;
	while((i=fis.read())!=-1)
	System.out.print((char)i);
	fis.close();
  }
  } 
