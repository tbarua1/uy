	//SequenceInputStream

	import java.io.*;
	import java.util.*;

	class SInput
  {	
	public static void main(String str[])throws IOException
  {
	SequenceInputStream sin=new  SequenceInputStream(new FileInputStream("e://dcc//.txt"),
							 new FileInputStream("e://dcc//xyz.txt")			
							);
	SequenceInputStream sin1=new  SequenceInputStream(new MyEnumeration());
	
	DataInputStream din=new DataInputStream(sin);
	
	String s=" ";
	
	while(s!=null)
  {
	s=din.readLine();
	if(s!=null)
	System.out.println(s);
	
  }
	din.close();	
  }
  }


	class MyEnum implements Enumeration
  {
	FileInputStream fin;
	String s1[]={"abc.txt","abc1.txt"};
	int i=0;
  
	public boolean hasMoreElements()
  {
	if(i<2)
  	return true;
	else 
	return false;
  }
	public Object nextElement()
  {	
	try
  {	
	fin=new FileInputStream(s1[i]);
  }
	catch(Exception e)
  { 
  }
	i++;
	return fin;
  }	
  }
  
 