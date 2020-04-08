package flyweight;

public class FlyweightExecuter {

	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();
		ims.takeOrder("Chips", 12);
		ims.takeOrder("Chips", 2);
		ims.takeOrder("Burger", 6412);
		ims.takeOrder("Chips", 12457);
		ims.takeOrder("Burger", 1244);
		ims.takeOrder("Chips", 1642);
		ims.takeOrder("Chips", 6412);
		ims.takeOrder("Pizza", 4712);
		ims.takeOrder("Chips", 126);
		ims.takeOrder("Burger", 152);
		ims.takeOrder("Pizza", 182);
		ims.process();
		System.out.println(ims.report());
	}

}
