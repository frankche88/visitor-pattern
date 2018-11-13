package unmsm.dyc.visitor.pattern.code.visitable;

import unmsm.dyc.visitor.pattern.code.AutoParte;
import unmsm.dyc.visitor.pattern.code.AutoParteVisitor;

public class Car implements AutoParte {
    AutoParte[] elements;

    public Car() {
        this.elements = new AutoParte[] {
            new Wheel("front left"), new Wheel("front right"),
            new Wheel("back left"), new Wheel("back right"),
            new Body(), new Engine()
        };
    }

    public void accept(final AutoParteVisitor visitor) {
        for (AutoParte elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}