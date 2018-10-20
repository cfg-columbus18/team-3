package com.team3.cfgteam3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActivityController {
	
	@RequestMapping("/activity")
    public String activity(@RequestParam(value="activityName", defaultValue="Meditation") String name) {
        return "activity";
    }
}