package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcSql 
{

	public static void main(String[] args) throws SQLException 
	{
		String url = "jdbc:mysql://Localhost:3306/test";
		String un = "ROOT";
		String pwd = "ROOT";
		Connection con = DriverManager.getConnection(url,un,pwd);
		Statement stmt = con.createStatement ();
		ResultSet res = stmt.executeQuery ("Select * from Data");
		while (res.next())
		{
			String name = res.getString (1);
			String password = res.getString (2);
			System.out.println (name+" "+password);
		}
		

	}

}
