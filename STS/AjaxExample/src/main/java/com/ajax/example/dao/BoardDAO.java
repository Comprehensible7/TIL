package com.ajax.example.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ajax.example.vo.BoardVO;
import com.ajax.example.vo.ReplyVO;

@Repository
public class BoardDAO {
	
	@Autowired
	private SqlSession session;

	public ArrayList<BoardVO> getBoardList() {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<BoardVO> list = null;
		
		try {
			list = mapper.getBoardList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public BoardVO getBoard(int boardNum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		BoardVO board = null;
		
		try {
			board = mapper.getBoard(boardNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return board;
	}

	public ArrayList<ReplyVO> getReplyList(int boardNum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<ReplyVO> list = null;
		
		try {
			list = mapper.getReplyList(boardNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
