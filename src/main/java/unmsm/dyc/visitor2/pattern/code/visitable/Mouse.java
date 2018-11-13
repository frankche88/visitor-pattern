package unmsm.dyc.visitor2.pattern.code.visitable;

import unmsm.dyc.visitor2.pattern.code.ComputerPart;
import unmsm.dyc.visitor2.pattern.code.ComputerPartVisitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}