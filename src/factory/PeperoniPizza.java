package factory;

/**
 * Explanation : 
 * @version : 2014. 1. 20.
 * @author : se
 * DesignPattern / package factory;
 */

public class PeperoniPizza extends Pizza {

	public PeperoniPizza() {
		super();
		System.out.println("put on a peporoni on dow");		
	}
	
	@Override
	public double getPrice() {
		return 4;
	}

}
