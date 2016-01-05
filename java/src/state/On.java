package state;

public class On implements State {

	@Override
	public void handle() {
		System.out.println("light on");
	}

}
