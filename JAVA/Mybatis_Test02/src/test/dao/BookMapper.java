package test.dao;

import java.util.ArrayList;

import test.vo.Book;

public interface BookMapper {

	// �Է�
	public int insertBook(Book book);
	// ��ü ���
	public ArrayList<Book> printAllBook();
	// ������������ ����
	public int deleteBook(String name);
	// ����
	public int updateBook(Book b);
	// �˻� (å �������� �˻�)
	public ArrayList<Book> searchBook(String name);
	
	
	
	
}
