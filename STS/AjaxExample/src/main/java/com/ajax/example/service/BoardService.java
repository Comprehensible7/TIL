package com.ajax.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajax.example.dao.BoardDAO;
import com.ajax.example.vo.BoardVO;
import com.ajax.example.vo.ReplyVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO dao;

	public ArrayList<BoardVO> getBoardList() {
		ArrayList<BoardVO> list = dao.getBoardList();
		
		return list;
	}

	public BoardVO getBoard(int boardNum) {
		BoardVO board = dao.getBoard(boardNum);
		
		return board;
	}

	public ArrayList<ReplyVO> getReplyList(int boardNum) {
		ArrayList<ReplyVO> list = dao.getReplyList(boardNum);
		
		return list;
	}

}
