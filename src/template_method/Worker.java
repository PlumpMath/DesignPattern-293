package template_method;

public abstract class Worker {

	
	/**
	 * @author se
	 * @version 2014. 1. 17.    
	 * specific method will be implemented in a sub classes
	 */
	protected abstract void doTask();

	/**
	 * @author se
	 * @version 2014. 1. 17.    
	 * implement a specific task between parent's task
	 */
	public final void work() {
		System.out.println("Start work...");
		doTask();
		System.out.println("Go Home!");
	}
	
}
