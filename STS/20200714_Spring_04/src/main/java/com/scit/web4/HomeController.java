package com.scit.web4;

import java.util.ArrayList;
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

		String str1 = "aaa";
		int num1 = 20;
		
		// 테이블에 값 넣어주기 -> 테이블에 값을 직접 넣는다.
		ArrayList<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		
		// 테이블에 넣어줄 값 생성 및 리스트 생성 -> VO에 값을 set해주고 넣는다
		ArrayList<MemberVO> list2 = new ArrayList<MemberVO>();
		
		// 각 회원정보마다 내용 set해주기
		
		// 1번 회원
		MemberVO m1 = new MemberVO();
		m1.setId("id1");
		m1.setPw("pw1");
		m1.setAge(20);
		
		// 2번 회원
		MemberVO m2 = new MemberVO();
		m2.setId("id2");
		m2.setPw("pw2");
		m2.setAge(30);
		
		// 2번 회원
		MemberVO m3 = new MemberVO();
		m3.setId("id3");
		m3.setPw("pw3");
		m3.setAge(40);
		
		// 리스트에 추가해주기
		list2.add(m1);
		list2.add(m2);
		list2.add(m3);
				
		// model에 넣어줘야 jsp에 전달됨
		model.addAttribute("list2", list2);
		model.addAttribute("str", str1);
		model.addAttribute("num", num1);
		model.addAttribute("list", list);
		
		return "home";
	}

}
