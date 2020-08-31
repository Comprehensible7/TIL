package com.scit39.web13.dao;

import java.util.ArrayList;

import com.scit39.web13.vo.BookVO;

public interface BookMapper {
	
	// insert
	public int insertBook(BookVO book);
	
	// selectAll
	public ArrayList<BookVO> selectAll();

	// delete
	public int deleteBook(String book_id);
	
	// update
	public int updateBook(BookVO book);
	
	// selectOne
	public BookVO bookSelectOne(String book_id);
	
}
