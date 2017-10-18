package creational.objectpool;

public class ExportingTask implements Runnable {
	private ObjectPool<ExportingProcess> pool;  
    private int threadNo;  
    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo){  
        this.pool = pool;  
        this.threadNo = threadNo;  
    }  
  
    public void run() {  
        // get an object from the pool  
        ExportingProcess exportingProcess = pool.borrowObject();  
        System.out.println("Thread " + threadNo + ": Object with process no. "  
                + exportingProcess.getProcessNo() + " was borrowed");  

        //you can  do something here in future  
        // .........  

           // return ExportingProcess instance back to the pool  
        pool.returnObject(exportingProcess);  

        System.out.println("Thread " + threadNo +": Object with process no. "  
               + exportingProcess.getProcessNo() + " was returned");  
    }  

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//
//	}

}
