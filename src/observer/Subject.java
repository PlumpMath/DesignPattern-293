package observer;

public interface Subject {
	void detachObserver(Observer observer);
	void attachObserver(Observer observer);
	
	
	/**
	 * Method ID  : notifyObservers
	 * Explanation : notify all attached observers 
	 */
	void notifyObservers();
}
