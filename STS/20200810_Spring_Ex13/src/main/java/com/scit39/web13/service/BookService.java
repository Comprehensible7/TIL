package com.scit39.web13.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scit39.web13.dao.BookDAO;
import com.scit39.web13.dao.BookMapper;
import com.scit39.web13.vo.BookVO;

@Service
public class BookService {

	@Autowired
	private BookDAO dao;

	@Autowired
	private HttpSession sn;

	// insert
	public String insertBook(BookVO book) {

		int cnt = dao.insertBook(book);

		String page = "redirect:/";

		if (cnt == 0) {
			page = "redirect:/book/bookFail";
		}

		return page;
	}

	// selectAll
	public ArrayList<BookVO> selectAll() {

		return dao.selectAll();
	}

	// delete
	public int deleteBook(String book_id) {
		
		return dao.deleteBook(book_id);
	}
	
	// update
	public int updateBook(BookVO book) {
			
		return dao.updateBook(book);
		}
	
	// selectOne
	public BookVO bookSelectOne(String book_id) {
		
		return dao.bookSelectOne(book_id);
		}
	
	
	public String bookLogin(BookVO book) {
		
		BookVO loginCheck = dao.bookSelectOne(book.getBook_id());
		
		String page = "";
		
		if((loginCheck != null) && (loginCheck.getBook_id().equals(book.getBook_id()))) {
			
			sn.setAttribute("loginId", book.getBook_id());
			
			page = "redirect:/";
			
		} else {
			page = "redirect:/book/loginForm";
		}
		
		return page;
	}
	
	public void bookLogout() {
		
		sn.removeAttribute("loginId");
		
	}
}
