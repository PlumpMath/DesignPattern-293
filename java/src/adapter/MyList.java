package adapter;

import javax.xml.soap.Node;

/**
 * Explanation : 
 * @version : 2014. 2. 20.
 * @author : se
 * DesingPattern / package adapter;
 */

public class MyList<T> {
	
	private T head, tail;
	
	public void insert(Node pos, T o) { }
	public void remove(Node pos) { }
	
	  public void insertHead (T o) { }
	  public void insertTail (T o) { }
	 
	  public T removeHead () { return head; }
	  public T removeTail () { return tail; }
	
	public T getHead(){ return head; } 
	
	
}
