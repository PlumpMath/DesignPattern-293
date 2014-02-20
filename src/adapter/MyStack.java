package adapter;

/**
 * Explanation : 
 * @version : 2014. 2. 20.
 * @author : se
 * DesingPattern / package adapter;
 */

public interface MyStack<T> {
	void push(T t);
	T pop();
	T top();
}
