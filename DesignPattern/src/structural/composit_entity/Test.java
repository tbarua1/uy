package structural.composit_entity;

public class Test {
/*Composite Entity pattern is used in EJB persistence mechanism. A Composite entity is an EJB entity bean which represents a graph of objects. When a composite entity is updated, internally dependent objects beans get updated automatically as being managed by EJB entity bean. Following are the participants in Composite Entity Bean.

    Composite Entity - It is primary entity bean. It can be coarse grained or can contain a coarse grained object to be used for persistence purpose.

    Coarse-Grained Object - This object contains dependent objects. It has its own life cycle and also manages life cycle of dependent objects.

    Dependent Object - Dependent object is an object which depends on coarse grained object for its persistence lifecycle.

    Strategies - Strategies represents how to implement a Composite Entity.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
	       client.setData("Test", "Data");
	       client.printData();
	       client.setData("Second Test", "Data1");
	       client.printData();
	}

}
