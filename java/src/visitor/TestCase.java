package visitor;

/**
 * Explanation : 
 * @version : 2014. 2. 19.
 * @author : se
 * DesingPattern / package visitor;
 */

public class TestCase {

	public static void main(String[] args) {
		Car car = new Car();
		car.accept(new CarElementPrintVisitor());
	}
	
}
