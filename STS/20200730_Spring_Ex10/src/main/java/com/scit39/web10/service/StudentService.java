package com.scit39.web10.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit39.web10.dao.StudentDAO;
import com.scit39.web10.vo.StudentVO;

@Service
public class StudentService {

	@Autowired
	private StudentDAO dao;

	@Autowired
	private HttpSession session;

	// 입력
	public String studentJoin(StudentVO student) {

		int cnt = dao.studentJoin(student);

		String page = "redirect:/";

		if (cnt == 0) {
			page = "redirect:/student/joinFail";

		}

		return page;
	}

	// 전체조회
	public ArrayList<StudentVO> studentAll() {

		return dao.studentAll();
	}

	// 삭제
	public int deleteStudent(String student_id) {
		int cnt = dao.deleteStudent(student_id);
		return cnt;

	}

	// 수정
	public String updateStudent(StudentVO student) {
		
		int cnt = dao.updateStudent(student);
		
		String page="redirect:/student/joinList";
		
		if(cnt == 0) {
			page="redirect:/student/joinFail";
		}

		return page;
	}

	// 조건검색
	public ArrayList<StudentVO> studentSearch(String student_id) {

		return dao.studentSearch(student_id);
	}

	// 로그인
	public String studentLogin(StudentVO student) {

		ArrayList<StudentVO> loginCheck = dao.studentSearch(student.getStudent_id());

		String page = "";

		for (int i = 0; i < loginCheck.size(); i++) {
			if (loginCheck.get(i) != null && loginCheck.get(i).getStudent_pw().equals(student.getStudent_pw())) {

				session.setAttribute("loginId", student.getStudent_id());

				page = "redirect:/";

			} else {
				page = "redirect:/student/loginForm";
			}

		}

		return page;
	}

	// 로그아웃
	public void studentLogout() {
		// session에서 로그인 정보를 삭제하는 기능
		session.removeAttribute("loginId");
	}

}
