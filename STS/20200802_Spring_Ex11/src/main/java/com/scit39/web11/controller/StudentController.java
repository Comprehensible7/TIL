package com.scit39.web11.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.web11.service.StudentService;
import com.scit39.web11.vo.StudentVO;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
	
	private static final Logger lg = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService sv;
	
	// joinForm
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		
		lg.info("회원가입 폼으로 이동");
		
		return "student/joinForm";
	}
	
	// join
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(StudentVO student) {
		
		lg.info("회원 가입");
		
		return sv.joinStudent(student);
		
	}
	
	// joinFail
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {
		
		lg.info("가입 실패");
		
		return "student/joinFail";
	}
	
	// select
	@RequestMapping(value="/joinList",method = RequestMethod.GET)
	public String studentAll(Model model) {
		
		model.addAttribute("studentList", sv.selectStudent());
		
		return "student/joinList";
		
	}
	
	// delete
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public String deleteStudent(String s_id) {
		
		lg.info("회원 삭제");
		sv.deleteStudent(s_id);
		
		return "redirect:/student/joinList";
		
	}
	// updateForm
	@RequestMapping(value="/updateForm", method = RequestMethod.GET)
	public String updateForm(Model model, String s_id, String s_name, String s_pw, String s_birth, String s_loc, String s_subject, String s_indate) {
		
		lg.info("업데이트 폼으로 이동");
		
		model.addAttribute("s_id", s_id);
		model.addAttribute("s_name", s_name);
		model.addAttribute("s_pw", s_pw);
		model.addAttribute("s_birth", s_birth);
		model.addAttribute("s_loc", s_loc);
		model.addAttribute("s_subject", s_subject);
		model.addAttribute("s_indate", s_indate);
		
		return "student/updateForm";
	}
	
	// update
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String update(StudentVO student) {
		
		lg.info("회원정보 수정");
		
		return sv.updateStudent(student);
	}
	
	// searchForm
	@RequestMapping(value = "/searchForm", method = RequestMethod.GET)
	public String searchForm() {
		
		lg.info("조회폼으로 이동");
		
		return "/searchForm";
	}
	
	// search
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchStudent(String s_id, Model model) {
		
		lg.info("조건검색 실행");
		
		model.addAttribute("studentList", sv.searchStudent(s_id));
		
		return "student/joinList";
	}
	
	// loginForm
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String studentLoginForm() {
		
		lg.info("로그인 폼으로 이동");
		
		return "student/loginForm";
	}
	
	// login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String studentLogin(StudentVO student) {
		
		lg.info("로그인");
		
		return sv.studentLogin(student);
	}
	
	// logout
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String studentLogout() {
		
		lg.info("로그아웃");
		
		sv.studentLogout();
		
		return "redirect:/";
	}
	
	

}
