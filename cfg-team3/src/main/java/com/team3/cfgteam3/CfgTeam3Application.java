package com.team3.cfgteam3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.team3.*")
public class CfgTeam3Application {

	public static void main(String[] args) {
		SpringApplication.run(CfgTeam3Application.class, args);
	}
}
