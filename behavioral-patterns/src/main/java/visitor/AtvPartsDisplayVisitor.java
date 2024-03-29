package visitor;

public class AtvPartsDisplayVisitor implements AtvPartVisitor {

	@Override
	public void visit(Fender fender) {
	System.out.println("We have fender");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("We have wheels");
	}

	@Override
	public void visit(Oil oil) {
		System.out.println("We have oil");
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("We have parts list");
	}

}
