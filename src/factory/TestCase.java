package factory;

import java.util.ArrayList;

import factory.Pizza.PizzaType;

/**
 * Explanation : 
 * @version : 2014. 1. 20.
 * @author : se
 * DesignPattern / package factory;
 */

public class TestCase {

	public static void main(String[] args) {
		
		ArrayList<Pizza> pizzaOrders = new ArrayList<Pizza>();
				
		/* 2 peperonies and seafood pizza */
		pizzaOrders.add(PizzaFactory.makePizza(PizzaType.Peperoni));
		pizzaOrders.add(PizzaFactory.makePizza(PizzaType.Peperoni));
		pizzaOrders.add(PizzaFactory.makePizza(PizzaType.Seafood));


	}

	
	
}
