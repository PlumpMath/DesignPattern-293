package adapter;

/**
 * Explanation : 
 * @version : 2014. 2. 20.
 * @author : se
 * DesingPattern / package adapter;
 */

public class MyListImpStack<T> extends MyList<T> implements MyStack<T> {

	@Override
	public void push(T t) {
		insertTail(t);
	}

	@Override
	public T pop() {
		return removeTail();
	}

	@Override
	public T top() {
		return getHead();
	}

}
