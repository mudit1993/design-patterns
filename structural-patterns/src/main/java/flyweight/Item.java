package flyweight;


//Instances of Item will be the flyweights
public class Item {

	private final String name;

	public Item(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
