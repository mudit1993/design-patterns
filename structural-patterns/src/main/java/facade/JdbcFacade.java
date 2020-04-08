package facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

	public DbSingleton instance;

	public JdbcFacade() {
		instance = DbSingleton.getInstance();
	}

	public int createTable() {
		int count = 0;
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER,StreetName VARCHAR(20), City VARCHAR(20))");
			System.out.println("Table created");
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public int insertIntoTable() {
		int count = 0;
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			count = sta.executeUpdate("INSERT INTO Address (ID,StreetName,City) values(1,'221B Baker street','London')");
			System.out.println(count + " record(s) created.");
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public List<Address> getAddresses() {

		List<Address> addresses = new ArrayList<Address>();
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			ResultSet results = sta.executeQuery("Select * from Address");

			while (results.next()) {
				addresses.add(new Address(results.getInt(1), results.getString(2), results.getString(3)));

			}
			results.close();
			sta.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return addresses;
	}

}

class Address {
	private Integer id;
	private String streetName;
	private String city;

	public Address(Integer id, String streetName, String city) {
		super();
		this.id = id;
		this.streetName = streetName;
		this.city = city;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
