package com.scit39.web13.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit39.web13.vo.BookVO;

@Repository
public class BookDAO {
	
	@Autowired
	private SqlSession session;
	
	// insert
	public int insertBook(BookVO book) {
		
		BookMapper mp = session.getMapper(BookMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mp.insertBook(book);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	// selectAll
	public ArrayList<BookVO> selectAll(){
		
		BookMapper mp = session.getMapper(BookMapper.class);
		
		ArrayList<BookVO> list = null;
		
		try {
			list = mp.selectAll();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	
	// delete
	public int deleteBook(String book_id) {
			
		BookMapper mp = session.getMapper(BookMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mp.deleteBook(book_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return cnt;
		}
	
	// update
	public int updateBook(BookVO book) {
		
		BookMapper mp = session.getMapper(BookMapper.class);
		
		int cnt = 0;
		
		try {
			cnt = mp.updateBook(book);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cnt;
	}
	
	// selectOne
	public BookVO bookSelectOne(String book_id) {
		
		BookMapper mp = session.getMapper(BookMapper.class);
		
		BookVO book = null;
		
		try {
			book = mp.bookSelectOne(book_id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return book;
	}

}
