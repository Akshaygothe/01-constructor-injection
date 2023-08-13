package com.akshay.springcoredemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.springcoredemo.common.Coach;

@RestController
public class DemoController {

	private Coach myCoach;
	
	public DemoController(Coach theCoach) {
		myCoach = theCoach;
	}
	
	@GetMapping("/deilyworkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
