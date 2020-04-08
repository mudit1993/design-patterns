package singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonExecutor {

	public static void main(String[] args) {
		SingletonStatic se1 = SingletonStatic.getInstance();

		SingletonStatic se2 = SingletonStatic.getInstance();

		System.out.println(se1);

		System.out.println(se2);

		DbSingleton instance = DbSingleton.getInstance();
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			int count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER,StreetName VARCHAR(20), City VARCHAR(20))");
			System.out.println("Table created");
			sta.close();

			sta = conn.createStatement();
			count = sta
					.executeUpdate("INSERT INTO Address (ID,StreetName,City) values(1,'221B Baker street','London')");
			System.out.println(count + " record(s) created.");
			sta.close();

			sta = conn.createStatement();
			ResultSet results = sta.executeQuery("Select * from Address");

			while (results.next()) {
				System.out.println(results.getInt(1) + " " + results.getString(2) + " " + results.getString(3));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// System.out.println(">>" + conn.getClass());
	}

}
