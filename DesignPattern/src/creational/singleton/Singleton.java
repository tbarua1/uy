package creational.singleton;

import java.util.logging.Logger;

public class Singleton {

	  private static Singleton singleton = null;
	  private static Logger logger = Logger.getAnonymousLogger();
	  private static boolean firstThread = true;
	  protected Singleton() {
	    // Exists only to defeat instantiation.
	  }
	  public static Singleton getInstance() {
	     if(singleton == null) {
	        simulateRandomActivity();
	        singleton = new Singleton();
	     }
	     logger.info("created singleton: " + singleton);
	     return singleton;
	  }
	  private static void simulateRandomActivity() {
	     try {
	        if(firstThread) {
	           firstThread = false;
	           logger.info("sleeping...");
	           Thread.currentThread();
				// This nap should give the second thread enough time
	           // to get by the first thread.
	             Thread.sleep(50);
	       }
	     }
	     catch(InterruptedException ex) {
	        logger.warning("Sleep interrupted");
	     }
}
}