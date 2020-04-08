package visitor;

public class VisitorExecutor {
	public static void main(String[] args) {
		PartsOrder order =new PartsOrder();
		order.addPart(new Oil());
		order.addPart(new Fender());
		order.addPart(new Wheel());

		order.accept(new AtvPartsShippingVisitor());
		order.accept(new AtvPartsDisplayVisitor());
	}
}
