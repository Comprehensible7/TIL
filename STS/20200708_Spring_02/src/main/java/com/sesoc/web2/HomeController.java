package com.sesoc.web2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sesoc.web2.vo.MemberVo;

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

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	// 사용자가 입력폼을 통해서 데이터를 전달하면 데이터를 받아서 출력하는 코드를 작성한다.
	// JSP(View영역)에서 입력한 데이터를 -> Java(Controller영역)클래스에서 받아서 출력
	// value부분은 jsp에서 action으로 넘겨주는 값, method도 마찬가지로 똑같이 해줌

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(String id, String pw, String name, int age) {

		System.out.println(id);
		System.out.println(pw);
		System.out.println(name);
		System.out.println(age);

		return "home";
	}

	@RequestMapping(value = "/join2", method = RequestMethod.POST)
	
	// 					의존성 주입 DI(Dependency Injection)	
	public String join2(MemberVo member) {

		System.out.println(member);
		
		return "home";
	}

}
