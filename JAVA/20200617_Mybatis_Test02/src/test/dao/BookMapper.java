package test.dao;

import java.util.ArrayList;

import test.vo.Book;

public interface BookMapper {

	// 입력
	public int insertBook(Book book);
	// 전체 출력
	public ArrayList<Book> printAllBook();
	// 도서제목으로 삭제
	public int deleteBook(String name);
	// 수정
	public int updateBook(Book b);
	// 검색 (책 제목으로 검색)
	public ArrayList<Book> searchBook(String name);
	
	
	
	
}
