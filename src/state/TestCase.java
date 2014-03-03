package state;

public class TestCase {
	
	public static void main(String[] args) {
		
		Bulb bulb = new Bulb(new On());
		bulb.handle();
		
		/* change state without switch-case or if-else statement */
		bulb.changeState(new Off());
		bulb.handle();
	
	}
}
