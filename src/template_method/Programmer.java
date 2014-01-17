package template_method;

public class Programmer extends Worker {

	public Programmer() {
		System.out.println("\n\nI'm a Progammer\n\n");
	}
	
	@Override
	protected void doTask() {
		System.out.println("Coding");
	}

}
