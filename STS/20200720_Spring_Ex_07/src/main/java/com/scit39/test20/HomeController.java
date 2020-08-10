package com.scit39.test20;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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
	public String home() {
		// syso대신에 로그를 찍어준다
		logger.info("메인으로 이동");

		return "home";
	}

}





//<!-- 순서 흐름도 -->
//<!-- 컨트롤러 -> Service -> DAO -> Mapper -> Mapper.xml -->