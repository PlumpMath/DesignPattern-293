package template_method;

public class TestCase {

	public static void main(String[] args) {
		
		/* programmer instance and do progammer's work */
		Worker programmer = new Programmer();
		programmer.work();
		
		/* designer instance and do designer's work */
		Worker designer = new Designer();
		designer.work();
		
	}

}
