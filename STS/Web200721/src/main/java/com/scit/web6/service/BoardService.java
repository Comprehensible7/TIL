package com.scit.web6.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web6.dao.BoardDAO;
import com.scit.web6.dao.BoardMapper;
import com.scit.web6.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;

	@Autowired
	private HttpSession session;

	public int boardWrite(BoardVO board) {

		// member_id를 추가
		// MemberService에서 로그인 시 입력한 값을 작성
		String member_id = (String) session.getAttribute("loginId");

		// board에 id를 set해준다
		board.setMember_id(member_id);

		 String page = "";

		int cnt = dao.boardWrite(board);

		// 성공 실패시 처리
		if(cnt == 0) {
			page = "/board/boardFail";
		} else {
			page = "/board/boardList/";
		}

		return cnt;
	}

	// 조인 테이블 조회
	public ArrayList<HashMap<String, Object>> boardList() {

		ArrayList<HashMap<String, Object>> list = dao.boardList();

		return list;

	}

	// 조건조회
	public HashMap<String, Object> boardRead(int board_no) {

		// 조회수 증가 후
		dao.updateHits(board_no);
		// 해당 글을 조회
		HashMap<String, Object> map = dao.boardRead(board_no);

		return map;
	}
	
	// 삭제
	public int boardDelete(int board_no) {
		
		int cnt = dao.boardDelete(board_no);

		return cnt;
	}
	
	// 수정
	public int boardUpdate(BoardVO board) {
	
		// 로그인 정보가져오기
		String member_id = (String)session.getAttribute("loginId");
		// 설정
		board.setMember_id(member_id);
				
		int cnt = dao.boardUpdate(board);
			
		return cnt;
	}
	
	// 검색
	public ArrayList<HashMap<String, Object>> searchBoard(String searchText, String searchType){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("searchText", searchText);
		map.put("searchType", searchType);
		
		ArrayList<HashMap<String, Object>> list = dao.searchBoard(map);
			
				
		return list;
	}
}
