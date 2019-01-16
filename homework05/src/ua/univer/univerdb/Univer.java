package ua.univer.univerdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Univer {
	Connection con;
	Statement stmt;
	
public Univer() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/univerdb", "root", "1");
	stmt= con.createStatement();
}
public void show() throws SQLException{
	String sql = "SELECT * FROM groups";
	ResultSet res = stmt.executeQuery(sql);
	while(res.next()){
		int id =res.getInt("ID_GR");
		String name = res.getString("name");
		Group group = new Group(id,name);
		System.out.println(group);
	}
}
public void addGroup(Group group) throws SQLException{
	String sql = "insert into groups values("+group.getId()+", '"+group.getName()+"')";
	stmt.executeUpdate(sql);
}

public void deleteGroup(String name) throws SQLException{
	String sql = "DELETE FROM groups WHERE name='"+name+"'";
	stmt.executeUpdate(sql);
}

}
