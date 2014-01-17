package singleton;

public class SingleTon {

	private static SingleTon instance;
	
	/* if instance is not initialized, return a new instance */
	public static SingleTon getInstance() {
		
		if( instance != null ) 
			return instance;
		return new SingleTon();		
	}
	
	private SingleTon() { /* initialize singleton instance */ }
	
	void someMethod() { }

}

