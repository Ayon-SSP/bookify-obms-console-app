package com.bookify.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton class at any given point of time only one object exist
// Two way -> Threading ->Synchronization it will allow only one to enter in the block
//1. it has its own object ref variable in it
//2. its default constructor is private
//3. getter method to access the priavate self object
public class DBConnection {

	private static DBConnection dbConnection;

	private final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String username = "obms_system";
	private final String password = "321654";
	private Connection connection;

	private DBConnection() {
		super();
	}

	public static DBConnection getDbConnection() {
		if (dbConnection == null) {
			synchronized (DBConnection.class) {
				if (dbConnection == null) {
					dbConnection = new DBConnection();
				}
			}
		}

		return dbConnection;
	}

	public Connection getConnection() {
		try {
			connection = DriverManager.getConnection(url, username, password);
			if (!connection.isClosed()) {
				System.out.println("Connected");
				return connection;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}