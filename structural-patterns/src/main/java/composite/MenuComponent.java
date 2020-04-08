package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {

	String name;
	String url;
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}
	
	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("It is not implemented at this level");
	}
	
	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("It is not implemented at this level");
	}

	public abstract String toString();

	String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(": ").append(url).append("\n");
		return builder.toString();

	}
}
