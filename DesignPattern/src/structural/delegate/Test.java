package structural.delegate;

public class Test {
/*Business Delegate Pattern is used to decouple presentation tier and business tier. It is basically use to reduce communication or remote lookup functionality to business tier code in presentation tier code. In business tier we have following entities.

    Client - Presentation tier code may be JSP, servlet or UI java code.

    Business Delegate - A single entry point class for client entities to provide access to Business Service methods.

    LookUp Service - Lookup service object is responsible to get relative business implementation and provide business object access to business delegate object.

    Business Service - Business Service interface. Concrete classes implement this business service to provide actual business implementation logic.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessDelegate businessDelegate = new BusinessDelegate();
	      businessDelegate.setServiceType("EJB");

	      Client client = new Client(businessDelegate);
	      client.doTask();

	      businessDelegate.setServiceType("JMS");
	      client.doTask();
	}

}
