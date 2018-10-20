package com.team3.cfgteam3.service.impl;

import org.springframework.stereotype.Service;

import com.team3.cfgteam3.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	public String fetchData(){
		return "Elizabeth 2.";
	}
}
