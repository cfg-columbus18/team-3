package com.team3.cfgteam3;

import java.sql.Connection;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.team3.*")
public class CfgTeam3Application {

	public static void main(String[] args) {
		SpringApplication.run(CfgTeam3Application.class, args);
		Connection conn = null;
		try {
	     conn = DBClass.connectToH2();
		
		Statement stmt = conn.createStatement();
		
		String sqlString = "CREATE TABLE IF NOT EXISTS Activity "
				+ "(Name VARCHAR(1000) NOT NULL PRIMARY KEY, "
				+ "Type VARCHAR(256) NOT NULL,"
				+ "Last timestamp NOT NULL,"
				+ "Total INTEGER(1000) DEFAULT 0,"
				+ "Description VARCHAR(10000));";
		stmt.execute(sqlString);
//		Statement stmt2 = conn.createStatement();
//		String sqlTrig = "CREATE TRIGGER updateTrigger "
//				+ "BEFORE UPDATE ON Activity "
//				+ "IF (OLD.last > NEW.last) THEN "
//				+ "NEW = OLD "
//				+ "ELSE "
//				+ "NEW.Total = OLD.Total +1 "
//				+ "END IF "
//				+ "NEW;";
//		stmt2.execute(sqlTrig);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		} finally {
			DBClass.close(conn);
		}
		
	}
}
