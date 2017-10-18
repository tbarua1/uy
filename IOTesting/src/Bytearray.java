
//ByteArrayInputStream and ByteArrayOutputStream 
import java.io.*;

public class Bytearray {
	public static void main(String[] ar) throws IOException {
		ByteArrayOutputStream fw = new ByteArrayOutputStream();
		String s = "Hello";
		byte by[] = s.getBytes();
		for (int i = 0; i < by.length; i++)
			fw.write(by[i]);
		fw.writeTo(new FileOutputStream("b.txt"));
		System.out.println(fw.toString());
		byte z[] = fw.toByteArray();

		ByteArrayInputStream fr = new ByteArrayInputStream(z);
		int i = 0;
		while ((i = fr.read()) != -1)
			System.out.println(i);

	}
}