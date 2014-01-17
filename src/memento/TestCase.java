package memento;

import java.util.ArrayList;

public class TestCase {

	public static void main(String[] args) {
		ArrayList<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();

		/* save a state */
		Originator originator = new Originator();
		originator.setState("State1");
		originator.setState("State2");
		
		/* restore saved state */
		savedStates.add(originator.saveToMemento());
				
		originator.setState("State3");
		savedStates.add(originator.saveToMemento());
		originator.setState("State4");

		originator.restoreFromMemento(savedStates.get(1));   
	}
}
