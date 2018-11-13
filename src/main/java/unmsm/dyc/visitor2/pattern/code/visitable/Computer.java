package unmsm.dyc.visitor2.pattern.code.visitable;

import unmsm.dyc.visitor2.pattern.code.ComputerPart;
import unmsm.dyc.visitor2.pattern.code.ComputerPartVisitor;

public class Computer implements ComputerPart {

	ComputerPart[] parts;

	public Computer() {
		parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}