package iterator;

public class BagIterator implements Iterator {

	/* iterate bag */
	private Bag bag;
	private int index;
	
	public BagIterator(Bag bag) {
		this.bag = bag;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < bag.getSize()) 
			return true;
		else
			return false;
	}

	@Override
	public Object next() {
		/* get a item from bag */
		return this.bag.getItem(index++);		
	}

}
