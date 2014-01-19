package composite;

import java.util.Vector;

/**
 * Explanation : 
 * @version : 2014. 1. 20.
 * @author : se
 * DesignPattern / package composite;
 */

public class CompositeShape implements Shape {
	
	private Vector<Shape> shapes = new Vector<Shape>();
	
	public void add(Shape s) {
		shapes.add(s);
	}
	
	@Override
	public void draw() {
		
		/* draw all composited leaf */
		for(Shape s : shapes) {
			s.draw();
		}		
	}
	
	
}
