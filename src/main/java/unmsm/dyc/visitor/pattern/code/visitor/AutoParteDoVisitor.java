package unmsm.dyc.visitor.pattern.code.visitor;

import unmsm.dyc.visitor.pattern.code.AutoParteVisitor;
import unmsm.dyc.visitor.pattern.code.visitable.Body;
import unmsm.dyc.visitor.pattern.code.visitable.Car;
import unmsm.dyc.visitor.pattern.code.visitable.Engine;
import unmsm.dyc.visitor.pattern.code.visitable.Wheel;

public class AutoParteDoVisitor implements AutoParteVisitor {
    public void visit(final Body body) {
        System.out.println("Moving my body");
    }

    public void visit(final Car car) {
        System.out.println("Starting my car");
    }

    public void visit(final Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    public void visit(final Engine engine) {
        System.out.println("Starting my engine");
    }
}