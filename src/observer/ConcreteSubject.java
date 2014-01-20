package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public void setAttribute(Object obj) {
		
		/* set a class's attribute */
		System.out.println("subject's attribute is changed.. " + obj.toString());
		
		notifyObservers();
	}
	
	
	@Override
	public void detachObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void notifyObservers() {

		for(Observer observer : observers) {
			observer.update(this);
		}

	}

}
