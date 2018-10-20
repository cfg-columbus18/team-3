package com.team3.cfgteam3.service.impl;

import org.springframework.stereotype.Service;

import com.team3.cfgteam3.service.ActivitiesService;

@Service
public class ActivitiesServiceImpl  implements ActivitiesService {

		public String getActivityName(){
			return "Activity Name";
		}
}
