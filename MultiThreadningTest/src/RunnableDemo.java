
public class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;

	public RunnableDemo(Thread t, String threadName) {
		//super();
		this.t = t;
		this.threadName = threadName;
	}

	public RunnableDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creatng Thread " + threadName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableDemo R1 = new RunnableDemo("Thread-1");
		R1.start();
		RunnableDemo R2 = new RunnableDemo("Thread-2");
		R2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
