package com.scit39.web12.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.web12.service.HospitalService;
import com.scit39.web12.vo.HospitalVO;

@Controller
@RequestMapping(value = "/hospital")
public class HospitalController {

	private static final Logger logger = LoggerFactory.getLogger(HospitalController.class);

	@Autowired
	private HospitalService hsv;

	// insert Form
	@RequestMapping(value = "/insertForm", method = RequestMethod.GET)
	public String insertForm() {

		logger.info("Insert Form 이동");

		return "hospital/insertForm";
	}

	// insert
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(HospitalVO hos) {

		logger.info("환자 등록 : {}", hos);

		return hsv.insertInfo(hos);
	}

	// 전체조회
	@RequestMapping(value = "/allInfo", method = RequestMethod.GET)
	public String allInfo(Model model) {
		model.addAttribute("hosList", hsv.allInfo());

		return "hospital/allInfo";

	}

	// 삭제
	@RequestMapping(value = "/deleteInfo", method = RequestMethod.GET)
	public String deleteInfo(int h_no) {

		hsv.deleteInfo(h_no);

		return "redirect:/hospital/allInfo";
	}

	// 수정폼으로 이동
	@RequestMapping(value="/updateForm", method = RequestMethod.GET)
	public String updateForm(Model model, int h_no) {
		
		HospitalVO hos = hsv.selectPa(h_no);
		model.addAttribute("hosList", hos);
		
		return "hospital/updateForm";
	}
	
	// 수정
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateInfo(HospitalVO hos) {

		logger.info("업데이트 : {}",hos);
		
		hsv.updateInfo(hos);
		
		return "redirect:/hospital/allInfo";
	}
	
	// 선택조회
	@RequestMapping(value="/selectForm", method = RequestMethod.GET)
	public String selectPa(Model model, int h_no) {
		
		HospitalVO hos = hsv.selectPa(h_no);
		model.addAttribute("hosList", hos);
		
		return "hospital/hosInfo";
	}
	
	// 로그인 폼 이동
	@RequestMapping(value="/loginForm",method = RequestMethod.GET)
	public String hosLoginForm() {
		
		return "hospital/hospitalLoginForm";
	}
	
	// 로그인
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String hosLogin(HospitalVO hos) {
		
		String page = hsv.hosLogin(hos);
				
		return page;		
	}
	
	
	// 로그아웃
	@RequestMapping(value="/logout",method = RequestMethod.GET)
	public String hosLogout() {
		hsv.hosLogout();
		
		return "redirect:/";
	}
}
