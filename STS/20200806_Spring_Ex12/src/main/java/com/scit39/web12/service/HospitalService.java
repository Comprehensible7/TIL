package com.scit39.web12.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit39.web12.dao.HospitalDAO;
import com.scit39.web12.vo.HospitalVO;

@Service
public class HospitalService {

	@Autowired
	private HospitalDAO dao;

	@Autowired
	private HttpSession sn;

	// 등록
	public String insertInfo(HospitalVO hos) {

		int cnt = dao.insertInfo(hos);

		String page = "redirect:/";

		if (cnt == 0) {
			page = "redirect:/hospital/joinFail";

		}

		return page;

	}

	// 전체조회
	public ArrayList<HospitalVO> allInfo() {

		return dao.allInfo();

	}

	// 삭제
	public int deleteInfo(int h_no) {

		int cnt = dao.deleteInfo(h_no);

		return cnt;
	}

	// 수정 (환자 번호 기준 조회)
	public int updateInfo(HospitalVO hos) {

		return dao.updateInfo(hos);
	}

	// 이름 선택조회
	public HospitalVO selectPa(int h_no) {

		HospitalVO hos = dao.selectPa(h_no);

		return hos;

	}
	
	// 로그인
	public String hosLogin(HospitalVO hos) {
		
		HospitalVO loginCheck = dao.selectPa(hos.getH_no());
		
		String page = "";
		
		System.out.println(loginCheck);
		
		if(loginCheck != null && loginCheck.getH_hnum().equals(hos.getH_hnum())) {
			
			sn.setAttribute("loginId", hos.getH_no());
			
			page = "redirect:/";
		} else {
			page = "redirect:/hos/loginForm";
		}
		
		System.out.println("page : " + page);
		
		return page;
	}
	
	
	
	// 로그아웃
	public void hosLogout() {
		sn.removeAttribute("loginId");
		
	}

}