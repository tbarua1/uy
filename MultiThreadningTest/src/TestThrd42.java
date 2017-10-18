
public class TestThrd42 extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("user defined thread");
	}

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());

		TestThrd42 ref = new TestThrd42();
		ref.start();


	}
}
