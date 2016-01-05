package composite;

/**
 * Explanation : 
 * @version : 2014. 1. 20.
 * @author : se
 * DesignPattern / package composite;
 */

public class TestCase {

	public static void main(String[] args) {

		CompositeShape composite = new CompositeShape();
		
		/* add some leaf to composite */
		composite.add(new Triangle());
		composite.add(new Circle());

		/* draw composited leaf */
		composite.draw();
	}

}
