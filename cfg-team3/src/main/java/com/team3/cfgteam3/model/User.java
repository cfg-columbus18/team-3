package com.team3.cfgteam3.model;

import java.util.ArrayList;

public class User {

	private String username;
	private ArrayList<Badge> achievedBadges;

	public User() {
		this("User");
	}
	
	public User(String name) {
		achievedBadges = new ArrayList<Badge>();
	}
	
	public void resetUser() {
		username = "";
		achievedBadges.clear();
	}
	
	public void addBadge(Badge badge) {
		achievedBadges.add(badge);
	}
	
	//GETTERS AND SETTERS
	
	public String getName() {
		return username;
	}
	
	public void setName(String newName) {
		username = newName;
	}
}
