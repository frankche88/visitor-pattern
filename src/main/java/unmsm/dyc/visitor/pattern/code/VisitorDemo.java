package unmsm.dyc.visitor.pattern.code;

import unmsm.dyc.visitor.pattern.code.visitable.Car;
import unmsm.dyc.visitor.pattern.code.visitor.AutoParteDoVisitor;
import unmsm.dyc.visitor.pattern.code.visitor.AutoPartePrintVisitor;

public class VisitorDemo {
	
	public static void main(final String[] args) {
        final Car car = new Car();

        car.accept(new AutoPartePrintVisitor());
        car.accept(new AutoParteDoVisitor());
    }

}

