package state;

public class Bulb {

	/* status interface */
	private State state;

	public Bulb(State state) {
		this.state = state;
	}

	public void changeState(State state) {
		this.state = state;
	}

	public void handle() {
		if(state != null) {
			state.handle();
		}
	}
}
