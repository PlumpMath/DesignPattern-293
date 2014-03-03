package visitor;

/**
 * Explanation : 
 * @version : 2014. 2. 19.
 * @author : se
 * DesingPattern / package visitor;
 */

public class Engine implements CarElement {

	@Override
	public void accept(CarElementVisitor visitor) {
		visitor.visit(this);
	}
}
