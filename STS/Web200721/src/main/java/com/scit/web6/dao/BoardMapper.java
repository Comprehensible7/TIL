package com.scit.web6.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.scit.web6.vo.BoardVO;

public interface BoardMapper {

	// 작성
	public int boardWrite(BoardVO board);
	
	// 					스트링 타입, 스트링타입과 인트타입을 모두받을 오브젝트
	public ArrayList<HashMap<String, Object>> boardList();
	
	// 조회수 , 업데이트는 리다이렉트
	public void updateHits(int board_no);
	
	// 선택조회 , 셀렉트는 포워드
	public HashMap<String, Object> boardRead(int board_no);
	
	// 삭제
	public int boardDelete(int board_no);
	
	// 수정
	public int boardUpdate(BoardVO board);
	
	// 검색
	public ArrayList<HashMap<String, Object>> searchBoard(HashMap<String, Object> map);
}
