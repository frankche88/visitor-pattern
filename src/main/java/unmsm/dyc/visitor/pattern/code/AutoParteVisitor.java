package unmsm.dyc.visitor.pattern.code;

import unmsm.dyc.visitor.pattern.code.visitable.Body;
import unmsm.dyc.visitor.pattern.code.visitable.Car;
import unmsm.dyc.visitor.pattern.code.visitable.Engine;
import unmsm.dyc.visitor.pattern.code.visitable.Wheel;

public interface AutoParteVisitor {
	
	void visit(Body body);
    void visit(Car car);
    void visit(Engine engine);
    void visit(Wheel wheel);

}
