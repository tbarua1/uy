package creational.singleton;

public class SingletonInstantiator {
	ClassicSingleton instance = ClassicSingleton.getInstance();
	ClassicSingleton anotherInstance =
	new ClassicSingleton();
}
