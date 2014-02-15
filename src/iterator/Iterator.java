package iterator;

public interface Iterator {
	/**
	 * @author se
	 * @version 2014. 2. 16.   
	 * @return 
	 * determine items have next item
	 */
	boolean hasNext();
	
	/**
	 * @author se
	 * @version 2014. 2. 16.   
	 * @return 
	 * get a next item
	 */
	Object next();
}
