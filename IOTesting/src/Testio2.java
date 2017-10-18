import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Testio2 {
public static void main(String[] args) throws IOException,FileNotFoundException 
{
	BufferedOutputStream bout1=new BufferedOutputStream(new DataOutputStream(new FileOutputStream("g:\\Practice\\aa.txt")));
	//BufferedOutputStream bout3=new BufferedOutputStream(new FileWriter(new File("g:\\Practice\\bb.txt")));
	
	BufferedInputStream bin=new BufferedInputStream(new BufferedInputStream(new FileInputStream("g:\\Practice\\asd.txt")));
	
	//FileOutputStream fout=new FileOutputStream(new File("g:\\Practice\\xyz.txt"));
    //BufferedOutputStream bout=new BufferedOutputStream(fout);
    BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream("g:\\Practice\\abcd.txt"));
    String s="abcd";
	byte b[]=s.getBytes();
	bout.write(b);
	System.out.println("Task Done !!");
}
/*	FileInputStream fin=new FileInputStream(new File("g:\\Practice\\xyz.txt"));
	int i;
	while((i=fin.read())!=-1)
	System.out.print((char)i); */
	/*FileWriter fw=new FileWriter(new File("g:\\Practice\\qw.txt"));
	String s="abcdef";
	fw.write(s);
	fw.close();
	FileReader fr=new FileReader(new File("g:\\Practice\\qw.txt"));
	int i;
	while((i=fr.read())!=-1)
	System.out.print((char)i);*/
	
/*	DataOutputStream dout=new DataOutputStream(new FileOutputStream("g:\\Practice\\qwer.txt"));
	String s="abcdefgh";
	byte b[]=s.getBytes();
	dout.write(b);
	System.out.println("Task is Done !!");
	
	DataInputStream din=new DataInputStream(new FileInputStream("g:\\Practice\\qw.txt"));
	int i;
	while((i=din.read())!=-1)
	System.out.print((char)i); */
	
}
