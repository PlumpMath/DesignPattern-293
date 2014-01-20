package template_method;

public abstract class Worker {

	protected abstract void doTask();
	
	public final void work() {
		
		/* all workers have to do this task */
		System.out.println("Go Office...");
		
		doTask();
		
		/* all workers go home */
		System.out.println("Go Home!");
	}
	
}
