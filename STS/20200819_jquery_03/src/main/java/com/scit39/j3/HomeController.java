package com.scit39.j3;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/test1", method = RequestMethod.GET)
	public String test1() {
	
		return "test1";
	}
	
	@RequestMapping(value="/example1", method = RequestMethod.GET)
	public String example1() {
	
		return "example1";
	}
	
	@RequestMapping(value="/join", method = RequestMethod.GET)
	public String join(String userid, String userpw, String gender, String hobby) {
		
		System.out.println("userid : " + userid);
		System.out.println("userpw : " + userpw);
		System.out.println("gender : " + gender);
		System.out.println("hobby : " + hobby);
		
		return "example1";
	}
}
