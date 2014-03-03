package visitor;

/**
 * Explanation : 
 * @version : 2014. 2. 19.
 * @author : se
 * DesingPattern / package visitor;
 */

public class Wheel implements CarElement {

	private String name;
	
    public Wheel(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }

}
