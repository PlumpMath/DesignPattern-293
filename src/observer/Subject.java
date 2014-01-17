package observer;

public interface Subject {
	void detachObserver(Observer observer);
	void attachObserver(Observer observer);
	void notifyObservers();
}
