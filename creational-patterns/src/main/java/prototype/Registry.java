package prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String,Item> items = new HashMap<String,Item>();
	
	public Registry() {
		loadItems();
	}

	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item) items.get(type).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
		
	}
	private void loadItems() {
		Movie movie = new Movie();
		movie.setPrice(299);
		movie.setRuntime("2.5 hours");
		movie.setTitle("Despicable me");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setNoOfPages(250);
		book.setPrice(399);
		book.setTitle("Sherlock Holmes");
		items.put("Book", book);
	}
}
