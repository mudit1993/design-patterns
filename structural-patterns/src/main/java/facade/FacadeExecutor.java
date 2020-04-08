package facade;

import java.util.List;

public class FacadeExecutor {
	public static void main(String[] args) {
		JdbcFacade instance = new JdbcFacade();
		instance.createTable();
		System.out.println("Table created!!");
		instance.insertIntoTable();
		System.out.println("Inserted!");
		List<Address> addresses = instance.getAddresses();
		addresses.stream().forEach(address -> {
			System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
		});

	}
}
