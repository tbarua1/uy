
//Read the data from the File
//DataInputStream

import java.io.*;

class DataRead {
	public static void main(String str[]) throws IOException {
		File  file=new File("e://dcc//abc.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		DataInputStream din = new DataInputStream(fileInputStream);
		String s = " ";
		while (s != null) {
			s = din.readLine();
			if (s != null)
				System.out.println(s);
		}
		din.close();
	}
};