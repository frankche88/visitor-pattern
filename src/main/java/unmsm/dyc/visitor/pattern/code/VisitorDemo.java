package unmsm.dyc.visitor.pattern.code;

import unmsm.dyc.visitor.pattern.code.visitable.Car;
import unmsm.dyc.visitor.pattern.code.visitor.AutoParteDoVisitor;
import unmsm.dyc.visitor.pattern.code.visitor.AutoPartePrintVisitor;

public class VisitorDemo {
	
	private final AutoParte car;
	
	VisitorDemo() {
		car = new Car();
	}
	
	public static void main(final String[] args) {
        
    
		new VisitorDemo().execute();
		
    }
	
	
	public void execute() {
		
		car.accept(new AutoPartePrintVisitor());
        car.accept(new AutoParteDoVisitor());
	}

}

