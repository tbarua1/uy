
public class ErrorTest {
	void f() {
		int n = 10;
	}

	// Error, closing brace is missing
	void g() {
		int m = 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = "Hello world";
			System.out.println(s.charAt(1));
			System.out.println(s.substring(5, 15));
		} catch (Exception e) {
			System.out.println("Error - "+e.getMessage());
		}
	}

}
