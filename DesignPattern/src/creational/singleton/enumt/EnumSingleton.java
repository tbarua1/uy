package creational.singleton.enumt;

public class EnumSingleton {
	/*
	 * Enum Singletons are new way to implement Singleton pattern in Java by
	 * using Enum with just one instance. Though Singleton pattern in Java
	 * exists from long time Enum Singletons are relatively new concept and in
	 * practice from Java 5 onwards after introduction of Enum as keyword and
	 * feature
	 *1) Enum Singletons are easy to write
	 */
	// INSTANCE;

	private volatile EnumSingleton INSTANCE;
	 
    private EnumSingleton(){}

    public EnumSingleton getInstance(){
        if(INSTANCE == null){
           synchronized(EnumSingleton.class){
               //double checking Singleton instance
               if(INSTANCE == null){
                   INSTANCE = new EnumSingleton();
               }
           }
        }
        return INSTANCE;
    }

}
