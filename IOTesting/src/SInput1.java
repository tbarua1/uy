
//sequenceinputstream and sequenceoutputstream !!

import java.io.*;
import java.util.*;

class SInput1 {
	public static void main(String str[]) throws IOException {
		SequenceInputStream sin = new SequenceInputStream(new MyEnumeration());
		DataInputStream din = new DataInputStream(sin);
		String s = " ";
		while (s != null) {
			s = din.readLine();
			if (s != null)
				System.out.println(s);
		}
		din.close();
	}
}

