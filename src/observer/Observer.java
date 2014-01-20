package observer;

public interface Observer {

	/**
	 * @author se
	 * @version 2014. 1. 17.   
	 * @param subject 
	 * update subject corresponding to param
	 */
	void update(Subject subject);
	
	/**
	 * @author se
	 * @version 2014. 1. 17.    
	 * implemented method after update subject
	 */
	void display();
}
