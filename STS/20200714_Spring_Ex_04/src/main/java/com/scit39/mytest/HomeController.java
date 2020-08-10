package com.scit39.mytest;

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

		String str1 = "main";
		int num1 = 30;
		
		
		// 직접 값 넣기
		ArrayList<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		
		// VO를 통한 값 넣기
		ArrayList<ProductVO> list2 = new ArrayList<ProductVO>();
		
		// 값 set해주기
		
		ProductVO p1 = new ProductVO();
		p1.setName("이름1");
		p1.setS_num("생산1");
		p1.setProduct_c("제품번호1");
		p1.setPrice(10);
		p1.setM_date(10);
		
		
		ProductVO p2 = new ProductVO();
		p2.setName("이름2");
		p2.setS_num("생산2");
		p2.setProduct_c("제품번호2");
		p2.setPrice(20);
		p2.setM_date(20);
		
		ProductVO p3 = new ProductVO();
		p3.setName("이름3");
		p3.setS_num("생산3");
		p3.setProduct_c("제품번호3");
		p3.setPrice(30);
		p3.setM_date(30);
		
		// 리스트에 추가하기
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);
		
		
		
		model.addAttribute("str", str1);
		model.addAttribute("num", num1);
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		
		
		return "home";
	}

}
