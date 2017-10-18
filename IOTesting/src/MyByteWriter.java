	//ByteWriter and Reader

	import java.io.*;
	
	class MyByteWriter
  {
	public static void main(String str[])throws IOException
  {
	ByteArrayOutputStream baos=new 	ByteArrayOutputStream();
	String s="Good country in the world" ;
	byte ch[]=s.getBytes();
					//baos.write(ch);
	for(int i=0;i<ch.length;i++)
	baos.write(ch[i]);
	baos.writeTo(new FileOutputStream("e://dcc//abc.txt"));
	System.out.print(baos.toString());
	byte z[]=baos.toByteArray();

	ByteArrayInputStream bais=new ByteArrayInputStream(z);
	int i=0;
	while((i=bais.read())!=-1)
	System.out.print((char)i);
	
  }
  }