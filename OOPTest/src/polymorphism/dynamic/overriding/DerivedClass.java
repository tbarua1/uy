package polymorphism.dynamic.overriding;

public class DerivedClass extends BaseClass {
	@Override
	public void methodToOverride() //Derived Class method
    {
         System.out.println ("I'm the method of DerivedClass");
    }
	@Override
	public void move () {
	      super. move (); // invokes the super class method
	      System.out.println ("Car is a good medium of transport ");
	    }
}
