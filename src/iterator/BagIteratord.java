package iterator;

public class BagIteratord implements Iterator {

	private Bag bag;
	private int index;
	
	public BagIteratord(Bag bag) {
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
		return this.bag.getItem(index++);		
	}

}
