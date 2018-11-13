package unmsm.dyc.visitor2.pattern.code;

import unmsm.dyc.visitor2.pattern.code.visitable.Computer;
import unmsm.dyc.visitor2.pattern.code.visitable.Keyboard;
import unmsm.dyc.visitor2.pattern.code.visitable.Monitor;
import unmsm.dyc.visitor2.pattern.code.visitable.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}
}