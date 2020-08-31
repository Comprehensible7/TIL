package com.scit.web.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.web.vo.BoardVO;

@Repository
public class BoardDAO {

	@Autowired
	private SqlSession session;
	
	public ArrayList<BoardVO> getBoardList(){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		ArrayList<BoardVO> list = null;
		
		try {
			list = mapper.getBoardList();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
