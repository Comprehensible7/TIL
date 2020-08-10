package com.scit39.web11.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit39.web11.dao.StudentDAO;
import com.scit39.web11.vo.StudentVO;

@Service
public class StudentService {
	
	@Autowired
	private StudentDAO dao;
	
	@Autowired
	private HttpSession sn;
	
	
	// join
	public String joinStudent(StudentVO student) {
		
		int cnt = dao.joinStudent(student);
		String page ="redirect:/";
		
		if(cnt == 0) {
			page = "redirect:/student/joinFail";
		}
		
		return page;
	}
	
	// select all
	public ArrayList<StudentVO> selectStudent(){
		
		return dao.selectStudent();
	}
	
	// delete
	public int deleteStudent(String s_id) {
		
		return dao.deleteStudent(s_id);
			
	}
	
	// update
	public String updateStudent(StudentVO student) {
	
		int cnt = dao.updateStudent(student);
		
		String page = "redirect:/student/joinList";
		
		if(cnt == 0) {
			page = "redirect:/student/joinFail";
			
		}		
				
		return page;
		
	}
	
	// search
	public ArrayList<StudentVO> searchStudent(String s_id){
		
		return dao.searchStudent(s_id);
		
		
	}
	
	// login
	// 조건검색 혹은 전체검색부분에서 아이디를 매개로 받아오는곳이 필요
	public String studentLogin(StudentVO student) {
		
		// 리스트의 변수 선언 후 dao에서 작성된 search부분을 사용
		// student내부에서 get_id를 해온다
		ArrayList<StudentVO> loginCheck = dao.searchStudent(student.getS_id());
		
		// 반환해줄 변수 선언
		String page ="";
		
		// 배열내부에서 값을 검증
		for(int i = 0; i < loginCheck.size(); i++) {
			// 조건문에서 로그인체크.겟 인덱스가 널이 아닐경우 &&
			// 로그인체크.겟 인덱스.겟 비밀번호
			// .이퀄스(스튜던트.겟 비밀번호)
			if(loginCheck.get(i) != null && loginCheck.get(i).getS_pw().equals(student.getS_pw())) {
				
				// 셋 어트리뷰트 
				// EL값 확인.겟 아이디
				sn.setAttribute("loginId", student.getS_id());
				
				page = "redirect:/";
			} else {
				page = "redirect:/student/loginForm";
			}
			
		}
		
		return page;
	}
	
	// logout
	public void studentLogout() {
		
		// 아이디 정보를 삭제
		sn.removeAttribute("loginId");
		
	}
	

}
