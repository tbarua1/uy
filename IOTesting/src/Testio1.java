import java.io.File;
import java.io.IOException;

public class Testio1 {
	public static void main(String[] args) throws IOException {
		File f = new File("Practice/abc.txt");

		if (f.exists()) {
			System.out.println("hello");
		} else {
			try{
			f.createNewFile();}catch(Exception e){}
		}
		System.out.println("Task is Done !!");

	}
}
