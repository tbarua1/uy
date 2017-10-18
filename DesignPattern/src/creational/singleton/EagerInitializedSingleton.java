package creational.singleton;

public class EagerInitializedSingleton {
	// static factory method
	// This is one of my favorite method to impelemnt Singleton pattern in Java,
	// Since Singleton instance is static and final variable it initialized when
	// class is first loaded into memeory so creation of instance is inherently
	// thread-safe.

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
