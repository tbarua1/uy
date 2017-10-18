import java.io.*;

class CopyFile {
	public static void main(String arg[]) throws IOException {
		DataInputStream din = new DataInputStream(new FileInputStream("abc.txt"));
		FileOutputStream fout = new FileOutputStream("abc1.txt");
		PrintStream dout = new PrintStream(fout);

		String s = " ";
		while (s != null) {
			s = din.readLine();

			if (s != null)
				dout.println(s);
			dout.flush();
		}
		din.close();
		fout.close();
	}
}
