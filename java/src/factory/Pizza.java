package factory;


/**
 * Explanation : 
 * @version : 2014. 1. 20.
 * @author : se
 * DesignPattern / package factory;
 */

public abstract class Pizza {

	public abstract double getPrice();
	enum PizzaType { Peperoni, Seafood }

	public Pizza() {
		System.out.println("Making a pizza");
	}


}
