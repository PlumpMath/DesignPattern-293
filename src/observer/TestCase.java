package observer;

public class TestCase {

	public static void main(String[] args) {
		
		ConcreteSubject subject = new ConcreteSubject();
		ConcreteObserver observer = new ConcreteObserver();
				
		// attach observer to subject
		subject.attachObserver(observer);
		
		// change subject's attribute
		subject.setAttribute("set attribute is invoked\n");
		
	}

}
