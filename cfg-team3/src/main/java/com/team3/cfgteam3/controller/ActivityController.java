package com.team3.cfgteam3.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ActivityController {
	
	String feeling = "sad";
	
	
	@RequestMapping(params = "happy", method = RequestMethod.GET)
	public void updateHappy(HttpServletRequest request) {
		//
	}
	@RequestMapping(params = "sad", method = RequestMethod.GET)
	public void updateSad(Map<String, String> model, HttpServletRequest request) {
		model.put("activity1", "Call a friend");
		model.put("activity2", "Listen to music");
	}
	@RequestMapping(params = "anxious", method = RequestMethod.GET)
	public void updateAnxious(Map<String, String> model, HttpServletRequest request) {
		model.put("activity1", "Deep breathing");
		model.put("activity2", "Visit the park or get fresh air");
	}
	@RequestMapping(params = "depressed", method = RequestMethod.GET)
	public void updateDepressed(Map<String, String> model, HttpServletRequest request) {
		model.put("activity1", "Positive self-talk");
		model.put("activity2", "Meditation and yoga");
	}
	@RequestMapping(params = "angry", method = RequestMethod.GET)
	public void updateAngry(Map<String, String> model, HttpServletRequest request) {
		model.put("activity1", "Write in your journal");
		model.put("activity2", "Go for a run");
	}
	
}
