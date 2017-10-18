package exception;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 10 / 0;
		} catch (Exception ex) {
			System.out.println("Inside 1st catch Block");
		} finally {
			System.out.println("Inside 1st finally block");
		}
		/**
		 * In this case exception won't, after executing try block the contol
		 * will goto finally block.
		 */
		try {
			int i = 10 / 10;
		} catch (Exception ex) {
			System.out.println("Inside 2nd catch Block");
		} finally {
			System.out.println("Inside 2nd finally block");
		}
	}

}
