package factory;

/**
 * Explanation : 
 * @version : 2014. 1. 20.
 * @author : se
 * DesignPattern / package factory;
 */

public class SeafoodPizza extends Pizza {

	public SeafoodPizza() {
		super();
		System.out.println("put on a seafood on dow");		
	}
	
	@Override
	public double getPrice() {
		return 6;
	}

}
