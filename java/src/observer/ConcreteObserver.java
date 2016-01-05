package observer;

import java.util.ArrayList;

public class ConcreteObserver implements Observer {

	private ArrayList<Subject> subjects = new ArrayList<Subject>();
		
	@Override
	public void update(Subject subject) {
		
		for( int i = 0; i < subjects.size(); ++i ) {
			
			if( subjects.get(i).equals(subject) ) {
				subjects.set(i, subject);
			}			
		}
		
		
		display();
	}

	@Override
	public void display() {
	
		System.out.println("Display is updated");
	}

}
