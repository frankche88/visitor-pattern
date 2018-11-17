package unmsm.dyc.visitor.pattern.code;

import unmsm.dyc.visitor.pattern.code.visitable.Car;
import unmsm.dyc.visitor.pattern.code.visitor.AutoParteDoVisitor;
import unmsm.dyc.visitor.pattern.code.visitor.AutoPartePrintVisitor;

public class VisitorDemo {
	
	private final AutoParte car;
	
	VisitorDemo(AutoParte car) {
		this.car = car;
	}
	
	public static void main(final String[] args) {
        
    
		new VisitorDemo(new Car()).execute();
		
    }
	
	
	public void execute() {
		
		car.accept(new AutoPartePrintVisitor());
        car.accept(new AutoParteDoVisitor());
	}

}

