package bridge.shape;

public class BridgeShapeExecutor {
	public static void main(String[] args) {
		Color blue = new Blue();
		Shape circle = new Circle(blue);
		circle.applyColor();
		Color green = new Green();
		Shape square = new Square(green);
		square.applyColor();
		
	}
}
