import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter First Number");
				int x = s.nextInt();
				System.out.println("Enter Second Number");
				int y = s.nextInt();
				int sum = x / y;
				System.out.println(sum);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error - "+e.getMessage());
			}
		} while (true);
	}
}
