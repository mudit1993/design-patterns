package composite;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
		return menuComponent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(print(this));
		
		menuComponents.stream().forEach(menuComponent ->{
			builder.append(menuComponent.toString());
		});	
		return builder.toString();
	}

}
