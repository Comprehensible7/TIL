package com.scit.web6.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web6.vo.BoardVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession session;

	public int boardWrite(BoardVO board) {

		BoardMapper mapper = session.getMapper(BoardMapper.class);

		int cnt = 0;

		try {
			cnt = mapper.boardWrite(board);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cnt;
	}

	// 조인 테이블 조회
	public ArrayList<HashMap<String, Object>> boardList(){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		ArrayList<HashMap<String, Object>> list = null;
		
		try {
			list = mapper.boardList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
		
	}
	
		// 조회수 , 업데이트는 리다이렉트
		public void updateHits(int board_no) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			try {
				mapper.updateHits(board_no);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		// 조건조회
		public HashMap<String, Object> boardRead(int board_no){
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			HashMap<String, Object> map = null;
			
			try {
				map = mapper.boardRead(board_no);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return map;
		}
		// 삭제
		public int boardDelete(int board_no) {
			
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			int cnt = 0;
			
			try {
				cnt = mapper.boardDelete(board_no);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return cnt;
		}
		
		// 수정
		public int boardUpdate(BoardVO board) {
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			int cnt = 0;
			
			try {
				cnt = mapper.boardUpdate(board);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return cnt;
		}
		
		// 검색
		public ArrayList<HashMap<String, Object>> searchBoard(HashMap<String, Object> map){
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			
			ArrayList<HashMap<String, Object>> list = null;
			
			try {
				list = mapper.searchBoard(map);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			return list;
		}
		
}
