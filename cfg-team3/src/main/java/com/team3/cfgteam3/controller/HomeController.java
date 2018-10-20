package com.team3.cfgteam3.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team3.cfgteam3.service.ProfileService;

@Controller
public class HomeController {
	
	@Autowired
	private ProfileService profileService;
	
    @RequestMapping("/test")
	public String home(Map<String, String> model) {
    	model.put("name", profileService.getDisplayName());
		return "index";
	}
	
}
