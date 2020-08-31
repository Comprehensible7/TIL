package com.scit39.a1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		
		return "test1";
	}
	
	// 리스폰스바디를 사용해야 ajax를 사용하는것으로 인식함
	@ResponseBody
	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public void first() {
		
		logger.info("통신 성공!");
	}
	
	@ResponseBody
	@RequestMapping(value = "/second", method = RequestMethod.GET)
	public void second(String msg) {
		
		logger.info("통신 성공!");
		logger.info("페이지로부터 전달받은 데이터 : {}", msg);
	}
	
	// 한글 사용가능하게 produces를 입력
	@ResponseBody
	@RequestMapping(value = "/third", method = RequestMethod.GET, produces = "application/text;charset=utf-8;")
	public String third() {
		
		logger.info("통신 성공!");
		
		return "Hello, 반갑습니다!";
	}
	
	@ResponseBody
	@RequestMapping(value = "/fourth", method = RequestMethod.POST, produces = "application/text;charset=utf-8;")
	public String fourth(String msg) {
		
		logger.info("통신 성공!");
		logger.info("페이지로부터 전달받은 데이터 : {}", msg);
		
		return "누구세요?";
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		
		return "test2";
	}
	
	// 한글 사용가능하게 produces를 입력
		@ResponseBody
		@RequestMapping(value = "/fifth", method = RequestMethod.POST, produces = "application/text;charset=utf-8;")
		public String fifth() {
			
			logger.info("통신 성공!");
			
			return "다시 만나요!";
		}
		
		// 한글 사용가능하게 produces를 입력
		@ResponseBody
		@RequestMapping(value = "/sixth", method = RequestMethod.GET, produces = "application/text;charset=utf-8;")
		public String sixth() {
					
			logger.info("통신 성공!");
					
			return "또 만나요!";
		}
	
}
