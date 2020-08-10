package com.scit39.web12.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit39.web12.vo.HospitalVO;

@Repository
public class HospitalDAO {

	@Autowired
	private SqlSession session;
	
	// 등록
	public int insertInfo(HospitalVO hos) {
	
		HospitalMapper mapper = session.getMapper(HospitalMapper.class);
		
		int cnt = 0;
	
		try {
			cnt = mapper.insertInfo(hos);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
		
	}
	
	// 전체조회
	public ArrayList<HospitalVO> allInfo(){
		
		HospitalMapper mapper = session.getMapper(HospitalMapper.class);
		
		ArrayList<HospitalVO> list = null;
		
		try {
			list = mapper.allInfo();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	// 삭제
	public int deleteInfo(int h_no) {
		
		HospitalMapper mapper = session.getMapper(HospitalMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mapper.deleteInfo(h_no);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
	}
		
	// 수정 (환자 번호 기준 조회)
	public int updateInfo(HospitalVO hos) {
			
		HospitalMapper mapper = session.getMapper(HospitalMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mapper.updateInfo(hos);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println(hos);
		return cnt;
	}
	
	// 이름 선택조회
	public HospitalVO selectPa(int h_no) {
		
		HospitalMapper mapper = session.getMapper(HospitalMapper.class);
		
		HospitalVO hos = null;
		
		try {
			hos = mapper.selectPa(h_no);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		System.out.println(hos);
		return hos;
		
	}
	
}
