package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	
	private static Connection connection ;
	
	public static Connection getConnection() throws SQLException,ClassNotFoundException{
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/la?serverTimezone=UTC";
		String user = "root";
		String password= "PASSWORD";
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url,user,password);
		return connection;
		
	   }
	}


  