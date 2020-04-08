package visitorbad;

public class VisitorExecutor {
	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Oil());
		order.addPart(new Fender());
		order.addPart(new Wheel());

		double shippingcost = order.calculateShipping();
		System.out.println("Shipping cost : " + shippingcost);
	}
}
