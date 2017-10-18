	import java.io.*;

	class Myclient11
  {
	ObjectOutputStream dout;
	public Myclient11()
  {
	try
  {
	Myclient1 e1=new Myclient1("Delhi",10,5,20);    
	dout=new ObjectOutputStream(new FileOutputStream("e://dcc//abc.txt"));
	dout.writeObject(e1);
	dout.flush();
  } 
	catch(Exception e)
  {
  }
  }
	public static void main(String str[])throws Exception
  {
	new Myclient11();
  }
  }