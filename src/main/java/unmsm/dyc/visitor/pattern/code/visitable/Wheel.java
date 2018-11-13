package unmsm.dyc.visitor.pattern.code.visitable;

import unmsm.dyc.visitor.pattern.code.AutoParte;
import unmsm.dyc.visitor.pattern.code.AutoParteVisitor;

public class Wheel implements AutoParte {
    private String name;

    public Wheel(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(final AutoParteVisitor visitor) {
        /*
         * accept(AutoParteVisitor) in Wheel implements
         * accept(AutoParteVisitor) in AutoParte, so the call
         * to accept is bound at run time. This can be considered
         * the *first* dispatch. However, the decision to call
         * visit(Wheel) (as opposed to visit(Engine) etc.) can be
         * made during compile time since 'this' is known at compile
         * time to be a Wheel. Moreover, each implementation of
         * AutoParteVisitor implements the visit(Wheel), which is
         * another decision that is made at run time. This can be
         * considered the *second* dispatch.
         */
        visitor.visit(this);
    }
}