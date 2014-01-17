package template_method;

public abstract class Worker {

	protected abstract void doTask();
	
	/**
	 * Method ID  : work
	 * Explanation : implement a specific task between parent's task 
	 */
	public final void work() {
		System.out.println("Start work...");
		doTask();
		System.out.println("Go Home!");
	}
	
}
