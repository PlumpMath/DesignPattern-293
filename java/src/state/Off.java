package state;

public class Off implements State {

	@Override
	public void handle() {
		System.out.println("bulb off");
	}

}
