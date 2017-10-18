package polymorphism.dynamic.overriding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass obj1 = new BaseClass(); 
        // BaseClass reference but DerivedClass object
        BaseClass obj2 = new DerivedClass(); 
        // Calls the method from BaseClass class
        obj1.methodToOverride(); 
        //Calls the method from DerivedClass class
        obj2.methodToOverride(); 
        
        DerivedClass b = new DerivedClass (); // Vehicle reference but Car object
        b.move (); //Calls the method in Car class
	}

}
