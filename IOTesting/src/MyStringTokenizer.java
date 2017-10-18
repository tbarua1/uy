
//StringTokenizer
import java.io.*;
import java.util.*;

class MyStringTokenizer {
	public static void main(String str[]) throws IOException {
		String s = "country=bangladesh;capital=dhaka;country=japan;capital=tokyo;";
		// StringTokenizer st=new StringTokenizer(s,"=;");
		String sp[] =s.split(";");
		for(int i=0;i<sp.length;i++){
			System.out.println(sp[i]);
		}
		
		StringTokenizer st = new StringTokenizer(s, ";");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}