package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

	private ArrayList<Observer> observers = new ArrayList<Observer>();


	/**
	 * @author se
	 * @version 2014. 1. 17.   
	 * @param obj 
	 * set a class's attribute then notify to observers
	 */
	public void setAttribute(Object obj) {

		
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
