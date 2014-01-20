package factory;

import factory.Pizza.PizzaType;

/**
 * Explanation : 
 * @version : 2014. 1. 20.
 * @author : se
 * DesignPattern / package factory;
 */

public class PizzaFactory {
	
	public static Pizza makePizza(PizzaType type) {

		switch(type) {

		case Peperoni:
			return new PeperoniPizza();

		case Seafood:
			return new SeafoodPizza();

		default:
			return null;

		}

	}
	
	public void m() {
		
	}
}
