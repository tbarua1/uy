package exception;

public class CustomExceptions {

	public static void main(String[] a) {
		try {
			CustomExceptions.myTest(null);
		} catch (MyAppException mae) {
			System.out.println("Inside catch block: " + mae.getMessage());
		}
	}

	static void myTest(String str) throws MyAppException {
		if (str == null) {
			throw new MyAppException("String value is null");
		}
	}
}

class MyAppException extends Exception {

	private String message = null;

	public MyAppException() {
		super();
	}

	public MyAppException(String message) {
		super(message);
		this.message = message;
	}

	public MyAppException(Throwable cause) {
		super(cause);
	}

	@Override
	public String toString() {
		return message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
