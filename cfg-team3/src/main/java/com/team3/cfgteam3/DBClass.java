package com.team3.cfgteam3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBClass {
	public  static Connection connectToH2() {
	Connection conn = null;
	try {
		conn = DriverManager.
			    getConnection("jdbc:h2:~/test");
	} catch (SQLException e1) {
		System.err.println(e1.getMessage());
	}
    return conn;
	}
	
	public static void close(Connection conn) {
		if(conn==null) {
			return;
		}
		try {
			conn.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
