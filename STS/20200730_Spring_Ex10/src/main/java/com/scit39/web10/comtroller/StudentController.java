package com.scit39.web10.comtroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.web10.service.StudentService;
import com.scit39.web10.vo.StudentVO;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService sv;

	// 폼 이동
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {

		logger.info("회원가입 폼 이동");

		return "student/joinForm";

	}

	// 가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(StudentVO student) {

		logger.info("회원 가입{}", student);

		return sv.studentJoin(student);
	}

	// 가입 실패
	@RequestMapping(value = "/joinFail", method = RequestMethod.GET)
	public String joinFail() {

		return "student/joinFail";
	}

	// 전체조회
	@RequestMapping(value = "/joinList", method = RequestMethod.GET)
	public String studentAll(Model model) {

		model.addAttribute("studentList", sv.studentAll());

		return "student/joinList";
	}

	// 삭제
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteStudent(String student_id) {
		sv.deleteStudent(student_id);
		return "redirect:/student/joinList";
	}

	// 수정 폼
	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public String updateForm(Model model, String student_id, String student_pw, String student_name,
			String student_subject, String student_indate) {

		logger.info("수정폼으로 이동");

		model.addAttribute("student_id", student_id);
		model.addAttribute("student_pw", student_pw);
		model.addAttribute("student_name", student_name);
		model.addAttribute("student_subject", student_subject);
		model.addAttribute("student_indate", student_indate);

		return "student/updateForm";
	}

	// 수정
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(StudentVO student) {

		logger.info("수정");
		sv.updateStudent(student);

		return "redirect:/student/joinList";
	}

	// 조회폼으로 이동
	@RequestMapping(value = "/searchForm", method = RequestMethod.GET)
	public String searchForm() {

		logger.info("조회폼으로 이동");

		return "student/searchForm";
	}

	// 조건검색
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(String student_id, Model model) {

		logger.info("검색");

		model.addAttribute("studentList", sv.studentSearch(student_id));

		return "student/joinList";
	}

	// 로그인 폼으로 이동
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String studentLoginForm() {

		return "student/studentLoginForm";

	}

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String studentLogin(StudentVO student) {

//		String page = service.memberLogin(member);

		return sv.studentLogin(student);

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String studentLogout() {

		sv.studentLogout();

		return "redirect:/";
	}
}
