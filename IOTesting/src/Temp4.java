import java.io.*;
import java.util.*;
class Temp4
{
public static void main(String str[])throws IOException
{
// FileOutputStream fin=new FileOutputStream("e://dcc//abc.txt");
PrintStream ps=new PrintStream(new FileOutputStream("e://dcc//abc.txt"));
ps.println("Hello");
ps.println("Hey");
}
}