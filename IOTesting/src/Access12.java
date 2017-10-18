import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Access12 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee e = new Employee("abcd", 20, 100);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("abcc.txt"));

		o.writeObject(e);
		o.close();

		ObjectInputStream oin = new ObjectInputStream(new FileInputStream(new File("abcc.txt")));

		Employee e1 = (Employee) oin.readObject();
		System.out.println(e1.name + " " + e1.age);
	}
}
