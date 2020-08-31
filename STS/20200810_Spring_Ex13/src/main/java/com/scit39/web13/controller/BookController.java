package com.scit39.web13.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit39.web13.service.BookService;
import com.scit39.web13.vo.BookVO;

@Controller
@RequestMapping(value="/book")
public class BookController {

	private static final Logger logger = LoggerFactory.getLogger(BookController.class);

	
	@Autowired
	private BookService bsv;
	
	// insertForm
	@RequestMapping(value="/insertBookForm", method = RequestMethod.GET)
	public String insertBookForm() {
		
		logger.info("등록 폼 이동");
		
		return "book/insertBookForm";
	}
	
	// insert
	@RequestMapping(value="/insert",method = RequestMethod.POST)
	public String insertBook(BookVO book) {
		
		logger.info("등록 : {} : " + book);
		
		return bsv.insertBook(book);
	}
	
	@RequestMapping(value="/bookFail",method = RequestMethod.GET)
	public String bookFail() {
		return "book/bookFail";
	}
	@RequestMapping(value="/bookList", method = RequestMethod.GET)
	public String selectAll(Model model) {
		
		model.addAttribute("bookList", bsv.selectAll());
		
		return "book/bookList";
	}
	
	@RequestMapping(value="/deleteOne", method = RequestMethod.GET)
	public String deleteBook(String book_id) {
		
		bsv.deleteBook(book_id);
		
		return "redirect:/book/bookList";
	}

	// 클릭한 정보를 bookInfo로 보내준다.
	// vo의 id정보를 받아서 보내준다
	@RequestMapping(value="/bookSelectOne", method = RequestMethod.GET)
	public String bookSelectOne(Model model, String book_id) {
		
		BookVO book = bsv.bookSelectOne(book_id);
		
		model.addAttribute("bookList", book);
		
		return "book/bookInfo";
	}
	
	// 클릭한 정보를 updateBookForm으로 보내준다.
	// vo의 id정보를 받아서 보내준다
	@RequestMapping(value="/updateBookForm", method = RequestMethod.GET)
	public String updateBookForm(Model model, String book_id) {
		
		BookVO book = bsv.bookSelectOne(book_id);
		model.addAttribute("bookList", book);
		
		return "book/updateBookForm";
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST)
	public String updateBook(BookVO book) {
		
		bsv.updateBook(book);
		
		return "redirect:/book/bookList";
	}
	
	@RequestMapping(value="/loginForm", method = RequestMethod.GET)
	public String bookLoginForm() {
		
		logger.info("로그인 페이지 이동");
		
		return "book/bookLoginForm";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String bookLogin(BookVO book) {
		
		logger.info("로그인 : {}", book.getBook_user(), book.getBook_pw());
		
		return bsv.bookLogin(book);
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String bookLogout() {
		
		logger.info("로그아웃");
		
		bsv.bookLogout();
		
		return "redirect:/";
	}
	
	
}
