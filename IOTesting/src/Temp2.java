import java.io.*;
class Temp2
{
public static void main(String str[])throws IOException
{
FileInputStream fin=new FileInputStream("abc1.txt");
//PrintStream ps=new PrintStream(fin);
System.setIn(fin);//(fin);
System.in.read();
}
}