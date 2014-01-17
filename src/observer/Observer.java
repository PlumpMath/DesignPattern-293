package observer;

public interface Observer {
	
	/**
	 * Method ID  : update
	 * Explanation : update subject corresponding to param
	 * @param subject 
	 */
	void update(Subject subject);
	
	/**
	 * Method ID  : display
	 * Explanation : implemented method after update subjecr 
	 */
	void display();
}
