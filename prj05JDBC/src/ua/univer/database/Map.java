package ua.univer.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Map {
	Connection con;
	Statement stmt;
	
	public Map() {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/3306/mapdb", "root", "1");
		stmt = con.createStatment();
		
	}

}
