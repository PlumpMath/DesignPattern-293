package singleton;

public class SingleTon {

	private static SingleTon instance;
	
	/*
	 * Method ID  : getInstance
	 * Explanation : if instance is not initialized, return a new instance 
	 * @return 
	 */
	public static SingleTon getInstance() {
		
		if( instance != null ) 
			return instance;
		return new SingleTon();		
	}
	
	private SingleTon() { /* initialize singleton instance */ }
	
	void someMethod() { }

}

