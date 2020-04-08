package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.EmbeddedDriver;

public class DbSingleton {

	public static volatile DbSingleton instance = null;
	public static volatile Connection conn = null;

	private DbSingleton() {
		//Class.forName("org.apache.derby.jdbc.Embeddeddriver");
		try {
			DriverManager.registerDriver(new EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (conn != null) {
			throw new RuntimeException("Use getConnection() to create the instance");
		}
		
		if (instance != null) {
			throw new RuntimeException("Use getInstance() to create the instance");
		}
		
	}
	
	public static DbSingleton getInstance() {
		if(instance == null) {
			synchronized (DbSingleton.class) {
				if(instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			synchronized (DbSingleton.class) {
				if(conn == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return conn;
	}

}
