package visitor;

public interface AtvPartVisitor {

	public void visit(Fender fender);

	public void visit(Wheel wheel);

	public void visit(Oil oil);

	public void visit(PartsOrder partsOrder);

}
