package structural.delegate;

public class BusinessLookUp implements BusinessService {
	public BusinessService getBusinessService(String serviceType) {

		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}


	public void doProcessing() {
		// TODO Auto-generated method stub
System.out.println(" i am at Business look up");
	}

}
