package template_method;

public class Designer extends Worker {

	public Designer() {
		System.out.println("\n\nI'm a Designer\n\n");
	}
	
	@Override
	protected void doTask() {
		System.out.println("Designing");
	}

}
