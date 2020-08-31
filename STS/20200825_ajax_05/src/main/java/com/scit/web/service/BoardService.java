package com.scit.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit.web.dao.BoardDAO;
import com.scit.web.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;
	
	public ArrayList<BoardVO> getBoardList() {
		ArrayList<BoardVO> list = dao.getBoardList();
		
		return list;
	}
	
}
