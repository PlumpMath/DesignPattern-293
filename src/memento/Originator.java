package memento;

public class Originator {
	
	/* program's state */
	private String state;

	public void setState(String state) {
		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}


	/**
	 * @author se
	 * @version 2014. 1. 17.   
	 * @return 
	 * create a memento
	 */
	public Memento saveToMemento() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento(state);
	}

	/**
	 * @author se
	 * @version 2014. 1. 17.   
	 * @param memento 
	 * restore from saved state
	 */
	public void restoreFromMemento(Memento memento) {
		state = memento.getSavedState();
		System.out.println("Originator: State after restoring from Memento: " + state);
	}
	
	/* container for a saving state */
	public static final class Memento {
		private final String state;

		public Memento(String stateToSave) {
			state = stateToSave;
		}

		public String getSavedState() {
			return state;
		}
	}
}
