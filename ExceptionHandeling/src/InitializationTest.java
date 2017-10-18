
public class InitializationTest {

	void m(int n) { // n is initialized from the actual parameter
		int i, j;
		i = 2; // i is initialized by the assignment
		int k = 1; // k is initialized in its declaration
		if (i == n) // OK
			k = j; // Error, j is not initialized
		else
			j = k;
	}

	void n(int n) {
		int i;
		if (n == n) // Always true
			i = n;
		else
			n = i; // Error, although never executed!!
	}

	int max(int i, int j) {
		if (i > j)
			return i;
		else if (i <= j)
			return j;
		// Error: what about the path when i>j and i<=j are both false?!!
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		int x = (int) b;// Inconvertable Type

		int a = 5;
		boolean b = true;
		int c = a + b; // Error, can’t add a boolean value
		double d = a + 1.4; // OK, int is implicitly converted to double

		float sum = 0.0;

		boolean b = true;
		int a = b;
	}

}
