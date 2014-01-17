package template_method;

public abstract class Worker {

	protected abstract void doTask();
	
	public final void work() {
		System.out.println("Start work...");
		doTask();
		System.out.println("Go Home!");
	}
	
}
