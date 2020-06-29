package test.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Book;

public class BookDAO {

	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	// 책 정보 저장
	public int insert(Book book) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			
			cnt = mapper.insertBook(book);
			
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		} finally {
			if(session != null) {
				session.close();
			}
		}
		
		return cnt;
	}
	
	public ArrayList<Book> printAll() {
		SqlSession session = null;
		// 초기화
		ArrayList<Book> list = null;
		
		try {
			// factory.openSession 선언
			session = factory.openSession();
			// 인터페이스 클래스화 작업
			BookMapper mapper = session.getMapper(BookMapper.class);
			
			list = mapper.printAllBook();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		
		return list;
	}
	
	public int deleteBook(String name) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession(); 
			BookMapper mapper = session.getMapper(BookMapper.class);
			
			cnt = mapper.deleteBook(name);
			
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		
		return cnt;
	}
	
	public int updateBook(Book b){
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			
			cnt = mapper.updateBook(b);
			
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		
		
		return cnt;
	}
	public ArrayList<Book> searchBook(String name){
		SqlSession session = null;
		ArrayList<Book> list = null;
		
		try {
			session = factory.openSession();
			BookMapper mapper = session.getMapper(BookMapper.class);
			
			list = mapper.searchBook(name);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return list;
	}
}
