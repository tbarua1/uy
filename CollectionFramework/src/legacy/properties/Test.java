package legacy.properties;

import java.util.Properties;

public class Test {
/*System properties are a feature that replaces the concept of environment variables (Which are platform-specific).
The System.getProperties method returns a Properties object.
The getProperty method returns a String representing the value of the name property.
Use the –D option on the command line to include a new property. The Properties class implements a mapping of names to values (a String-to-String map).
The propertyNames method returns an Enumeration of all property names.
The getProperty method returns a String representing the value of the named property.
You can also read and write a properties collection into a file using load and store.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props = System.getProperties();
	    props.list(System.out);
	}

}
