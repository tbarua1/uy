
/*	Line by line read the data from the keyboard  */
/*	BufferedReader/Writer			     */

import java.io.*;

class MyBufferedWriter {
	public static void main(String str[]) throws IOException {
		InputStreamReader fr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("abc1.txt");
		// BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(fw);
		String st = " ";
		while (!st.equals("stop")) {
			st = br.readLine();
			// bw.write(st);
			// bw.write(" ");
			pw.println(st);
			pw.flush();
		}
		br.close();
		// bw.close();
		fw.close();
	}
}

class MyBufferedReader {
	public static void main(String str[]) throws IOException {
		FileReader fr = new FileReader("abc1.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = " ";
		while (s != null) {
			s = br.readLine();
			if (s != null)
				System.out.println(s);
		}
	}
}