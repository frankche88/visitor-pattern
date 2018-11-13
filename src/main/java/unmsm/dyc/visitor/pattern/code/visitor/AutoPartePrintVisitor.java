package unmsm.dyc.visitor.pattern.code.visitor;

import unmsm.dyc.visitor.pattern.code.AutoParteVisitor;
import unmsm.dyc.visitor.pattern.code.visitable.Body;
import unmsm.dyc.visitor.pattern.code.visitable.Car;
import unmsm.dyc.visitor.pattern.code.visitable.Engine;
import unmsm.dyc.visitor.pattern.code.visitable.Wheel;

public class AutoPartePrintVisitor implements AutoParteVisitor {
    public void visit(final Body body) {
        System.out.println("Visiting body");
    }

    public void visit(final Car car) {
        System.out.println("Visiting car");
    }

    public void visit(final Engine engine) {
        System.out.println("Visiting engine");
    }

    public void visit(final Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }
}