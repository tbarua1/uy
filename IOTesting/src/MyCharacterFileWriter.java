	//Character Writer Here I will convert the data into 
	//character because it is 
	//characterStream ||

	import java.io.*;

	class MyCharacterFileWriter
  {
	public static void  main(String str[])throws IOException
  {
	FileWriter fw=new FileWriter("e://dcc//abc.txt");
	String s="Good country";
	                   //fw.write(s);
	char ch[]=s.toCharArray();
	   			//fw.write(ch);
	for(int i=0;i<ch.length;i++)
	fw.write(ch[i]);
	fw.close();
  }
  }
	

	class MyCharacterFileReader
  {
	public static void main(String str[])throws IOException
  {
	FileReader fr=new FileReader("e://dcc//.txt");	
	int i=0;
	while((i=fr.read())!=-1)
 	System.out.print((char)i);
	fr.close();
  }
  }	