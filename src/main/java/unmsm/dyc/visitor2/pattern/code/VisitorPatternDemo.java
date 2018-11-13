package unmsm.dyc.visitor2.pattern.code;

import unmsm.dyc.visitor2.pattern.code.visitable.Computer;

public class VisitorPatternDemo {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}