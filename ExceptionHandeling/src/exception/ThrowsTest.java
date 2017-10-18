package exception;

public class ThrowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsTest mytc = new ThrowsTest();
		try {
			for (int i = 0; i < 10; i++) {
				mytc.getJunk();
				System.out.println(i);
			}
		} catch (InterruptedException iex) {
			iex.printStackTrace();
		}
	}

	public void getJunk() throws InterruptedException {
		Thread.sleep(1000);
	}
}
