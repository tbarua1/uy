package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E://file.txt");
	      try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error - "+e.getMessage());
			
		} 
	}

}
