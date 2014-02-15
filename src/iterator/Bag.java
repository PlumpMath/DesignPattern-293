package iterator;

public class Bag implements Aggregate {

	private Item[] items;
	private int lastItem = 0;
	
	public Bag(int maxSize) {
		this.items = new Item[maxSize];
	}
	
	public Item getItem(int index) {
		return items[index];
	}
	
	public void addItem(Item item) {
		this.items[lastItem++] = item;
	}
	
	
	public int getSize() {
		return items.length;
	}
	
	@Override
	public Iterator iterator() {
		return new BagIteratord(this);
	}
	
}
