package factory;

import java.util.ArrayList;

/**
 * Explanation : 
 * @version : 2014. 1. 20.
 * @author : se
 * DesignPattern / package factory;
 */

public class TestCase {


	ArrayList<Pizza> pizzaOrders = new ArrayList<Pizza>();
	
	PizzaFactory.makePizza(new PeperoniPizza());
	
}
