package visitor;

/**
 * Explanation : 
 * @version : 2014. 2. 19.
 * @author : se
 * DesingPattern / package visitor;
 */

public interface CarElementVisitor {
	void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
