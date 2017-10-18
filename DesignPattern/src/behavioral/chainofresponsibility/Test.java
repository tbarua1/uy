package behavioral.chainofresponsibility;

/*In chain of responsibility, sender sends a request to a chain of objects. The request can be handled by any object in the chain.

A Chain of Responsibility Pattern says that just "avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request". For example, an ATM uses the Chain of Responsibility design pattern in money giving process.

In other words, we can say that normally each receiver contains reference of another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.*/
public class Test {
	public static void main(String[] args) {
		Logger chainLogger = doChaining();

		chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
		chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
		chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");

	}

	private static Logger doChaining() {
		Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);

		Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);

		Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
		errorLogger.setNextLevelLogger(debugLogger);

		return consoleLogger;
	}
}
/*
 * Chain of responsibility pattern is used to achieve lose coupling in software
 * design where a request from client is passed to a chain of objects to process
 * them. Then the object in the chain will decide themselves who will be
 * processing the request and whether the request is required to be sent to the
 * next object in the chain or not.
 * 
 * We know that we can have multiple catch blocks in a try-catch block code.
 * Here every catch block is kind of a processor to process that particular
 * exception. So when any exception occurs in the try block, its send to the
 * first catch block to process. If the catch block is not able to process it,
 * it forwards the request to next object in chain i.e next catch block. If even
 * the last catch block is not able to process it, the exception is thrown
 * outside of the chain to the calling program.
 */