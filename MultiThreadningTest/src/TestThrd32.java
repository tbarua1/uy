
public class TestThrd32 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestThrd32 t = new TestThrd32();

		Thread ref = new Thread(t);
		ref.start();

	}
}
