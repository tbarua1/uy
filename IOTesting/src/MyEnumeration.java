import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;

class MyEnumeration implements Enumeration {
	InputStream in[];
	int i = 0;

	MyEnumeration() {
		try {
			in = new InputStream[] { new FileInputStream("e//dcc//abc.txt"), new FileInputStream("tarun.txt"),
					new FileInputStream("e://dcc//abc1.txt") };
		} catch (Exception e) {
		}
	}

	public boolean hasMoreElements() {
		if (i < 3)
			return true;
		else
			return false;
	}

	public Object nextElement() {
		return in[i++];
	}
}