package observer;

public interface Subject {
	void detachObserver(Observer observer);
	void attachObserver(Observer observer);

	/**
	 * @author se
	 * @version 2014. 1. 17.    
	 * notify all attached observers 
	 */
	void notifyObservers();
}
