package template_method;

public class TestCase {

	public static void main(String[] args) {
		
		Worker programmer = new Programmer();
		programmer.work();
		
		Worker designer = new Designer();
		designer.work();
		
	}

}
