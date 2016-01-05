package visitor;

/**
 * Explanation : 
 * @version : 2014. 2. 19.
 * @author : se
 * DesingPattern / package visitor;
 */

public class CarElementPrintVisitor implements CarElementVisitor {
	
	public void visit(Wheel wheel) {      
		System.out.println("Visiting "+ wheel.getName()
				+ " wheel");
	}

	public void visit(Engine engine) {
		System.out.println("Visiting engine");
	}

	public void visit(Body body) {
		System.out.println("Visiting body");
	}

	public void visit(Car car) {      
		System.out.println("Visiting car");
	}
}
