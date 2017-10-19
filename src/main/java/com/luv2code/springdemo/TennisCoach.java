package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// define default constructor
	public TennisCoach() {
		System.out.println(" >> TennisCoach: inside default constructor");
	}
	
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkOut() {
		return "Pratice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
