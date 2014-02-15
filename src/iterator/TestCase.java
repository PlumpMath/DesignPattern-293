package iterator;

public class TestCase {

	public static void main(String[] args) {
		Bag bag = new Bag(10);
		
		for(int i = 0; i < 10; ++i) {
			bag.addItem(new Item("item" + i));
		}
		
		BagIteratord iter = (BagIteratord) bag.iterator();
		
		while(iter.hasNext()) {
			Item item = (Item) iter.next();
			System.out.println(item.getName());
		}
		
	}

}
