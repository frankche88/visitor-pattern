package unmsm.dyc.visitor2.pattern.code;

import unmsm.dyc.visitor2.pattern.code.visitable.Computer;
import unmsm.dyc.visitor2.pattern.code.visitable.Keyboard;
import unmsm.dyc.visitor2.pattern.code.visitable.Monitor;
import unmsm.dyc.visitor2.pattern.code.visitable.Mouse;

public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}