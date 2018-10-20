package com.team3.cfgteam3;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.team3.*")
public class CfgTeam3Application {
	static Connection conn = null;
	public static void main(String[] args) {
		SpringApplication.run(CfgTeam3Application.class, args);
		
		try {
	     conn = DBClass.connectToH2();
		
		Statement stmt = conn.createStatement();
		
		String sqlString = "CREATE TABLE IF NOT EXISTS Activity "
				+ "(Name VARCHAR(1000) NOT NULL PRIMARY KEY, "
				+ "Type VARCHAR(256) NOT NULL, "
				+ "Last timestamp NOT NULL, "
				+ "Total INTEGER(1000) DEFAULT 0, "
				+ "Description VARCHAR(10000));";
		stmt.execute(sqlString);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		} finally {
			DBClass.close(conn);
		}
		
	}
	public boolean update(String tname, String ttype, Time tlast, int ttotal, String descr) {
		try {
			conn = DBClass.connectToH2();
			Statement stmt3 = conn.createStatement();
			String sqlupdate = "IF name EXISTS IN Activity THEN "
					+ "UPDATE Activity "
					+ "SET Last=tlast "
					+ "SET Total = ttotal " 
					+ "WHERE Name = tname "
					+ "ELSE INSERT INTO Activity VALUES(tname, ttype, tlast, ttotal, descr) "
					+ "END IF;";
			
		return true;
	}catch(Exception e) {
		return false;
	}}
}
