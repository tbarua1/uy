import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class EmpInfo implements Serializable
{	
	//private static final long serialVersionUID = 1L;
	public String User_name;
	public transient int age;
	public EmpInfo(String User_name,int age){
		this.User_name=User_name;
		this.age=age;
}}
public class Test121 {
private static final long serialVersionUID = 2L;
public static void main(String[] args)throws Exception {
	EmpInfo e=new EmpInfo("abcd",0);
	
/*	FileOutputStream fout=new FileOutputStream("e://dcc//obj.txt");
	ObjectOutputStream oout=new ObjectOutputStream(fout);
	
	oout.writeObject(e);
	
	oout.flush();
	fout.close();
	System.out.println("All set"); */
	
	System.out.println("To Deserialize");
	ObjectInputStream oin=new ObjectInputStream(new FileInputStream("e://dcc//obj.txt"));
	EmpInfo t=(EmpInfo)oin.readObject();
	System.out.println(t.User_name);
	System.out.println(t.age); 
}
}
