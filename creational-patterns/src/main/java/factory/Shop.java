package factory;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new CatalogPage());
		pages.add(new SearchPage());
	}

}
