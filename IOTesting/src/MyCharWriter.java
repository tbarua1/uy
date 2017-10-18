	//CharArrayReader
	import java.io.*;
	class MyCharWriter
  {
	public static void main(String str[])throws IOException
  {	
	CharArrayWriter fw=new CharArrayWriter();
	String s="Good country ";
	char ch[]=s.toCharArray();
			//fw.write(ch);
	for(int i=0;i<ch.length;i++)
	fw.write(ch[i]);
	fw.writeTo(new FileWriter("e://dcc//abc.txt"));
	System.out.println(fw.toString());


	char z[]=fw.toCharArray();
	CharArrayReader fr=new CharArrayReader(z);
	int i=0;
	while((i=fr.read())!=-1)
 	System.out.print((char)i);
  }
  }
                                                                                                                             
