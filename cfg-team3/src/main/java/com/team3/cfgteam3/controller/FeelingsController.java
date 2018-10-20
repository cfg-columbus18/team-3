package com.team3.cfgteam3.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/feelings")
public class FeelingsController {
	Map<String, String> model;
	
	@RequestMapping(method = RequestMethod.GET)
	public void update(HttpServletRequest request) {

	}
		
}


