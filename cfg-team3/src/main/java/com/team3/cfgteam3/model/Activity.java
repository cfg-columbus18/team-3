package com.team3.cfgteam3.model;

public class Activity {

	private String activityName;
	private String activityDesc;
	private int timesAccessed;
	
	public Activity(String name) {
		this(name, "");
	}
	
	public Activity(String name, String description) {
		activityName = name;
		activityDesc = description;
		timesAccessed = 0;
	}
	
	public void increaseAccessCount() {
		timesAccessed += 1;
	}
	
}
