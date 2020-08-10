package com.sesoc.web1;

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
	//				요청주소가 오는부분	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

	// index를 호출한다
	// http://localhost:9090/index
	//	@는 어노테이션임
	@RequestMapping(value = "index", method = RequestMethod.GET)
	
	
	// 데이터를 서로 주고받을 수 있게해준다. jsp에서도 데이터를 꺼내쓸 수 있음
	// Model은 MVC패턴 중 M을 말한다.
	// method 생성
	public String index(Model model) {
		System.out.println("Request Index Page");
		
		//					Key값
		model.addAttribute("scit", 39);
		
		return "index";
	}
	
	
}
