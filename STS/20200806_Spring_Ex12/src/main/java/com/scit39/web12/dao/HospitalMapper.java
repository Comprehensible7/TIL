package com.scit39.web12.dao;

import java.util.ArrayList;

import com.scit39.web12.vo.HospitalVO;

public interface HospitalMapper {
	
	// 등록
	public int insertInfo(HospitalVO hos);
	
	// 전체 조회
	public ArrayList<HospitalVO> allInfo();

	// 삭제 (환자 번호 기준 삭제)
	public int deleteInfo(int h_no);
	
	// 수정 (환자 번호 기준 조회)
	public int updateInfo(HospitalVO hos);
	
	// 수정 폼 이름 선택조회(환자번호 조회)
	public HospitalVO selectPa(int h_no);
	
	// 조건 조회 (환자 이름 조회)
	public ArrayList<HospitalVO> searchInfo(String h_name);
	
}

