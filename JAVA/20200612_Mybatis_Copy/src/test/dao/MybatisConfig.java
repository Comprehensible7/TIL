package test.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis의 환경 설정 읽고 객체 생성
 */

// 메서드나 변수 
// 스태틱 o - > 로딩 -> 실행
// 스태틱 x -> 객체생성 또는 메서드 실행때  -> 실행됨
public class MybatisConfig {
	// 1. 클래스 로딩하자마자 선언됨, 값은 널
	// 아래의 xml의 정보를 모두 가지고있는 객체가 sqlsessionfactory이다.
	// private이라 다른클래스에서 직접적인 사용 불가
	// 아무런 값도 안들어가있어서 null인 상황
	// 접속정보라 프로그램이 먼저 만들어둠, 준비해둠
	private static SqlSessionFactory sqlSessionFactory;

	// static 블럭 (2. 로딩될때 실행됨)
	// 2-1. 해당 클래스가 로딩될 때 딱 한번만 호출됨.(실행), 일회성 코드
	// 어플리케이션이 실행돠면 어플리케이션 안에 있는 모든 클래스가 로딩됩니다.
	// 자바책 스태틱 블럭쪽에 있음 (160페이지)
	// static 변수를 초기화하기위해 많이 쓰이는 방식, 직접 호출 불가
	// 메인메서드보다 먼저 실행할 일이 있는경우에 사용
	// 클래스 로딩과 객체생성은 다르다.(실행과도 다름, 그냥 한번 스캔하는느낌)
	static {
		String resource = "mybatis-config.xml";		//Mybatis 환경설정 파일 읽기. src 경로에 저장.
		

		// 이 코드는 딱 한번만 실행이 가능함
		// 서버끄기전까진 한번만 실행됨
		// 디자인 패턴 중 싱글톤 패턴 코드, 사용빈도 높음
		try {
			// 정보를 읽어서
			// Resources 자바에서 제공하는 클래스
			// getResourceAsReader(resource)파일경로지정해주면 읽어주는 기능을함
			Reader reader = Resources.getResourceAsReader(resource);
			// 객체를 생성 (사용정보는 위의 xml의 내용)
			// 위의 정보를 읽어서 객체를 만들어줌
			// 한번생성 및 실행됨
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			// 파일 다 읽었으니 닫아줌
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 다른 클래스에서 호출해서 사용할 수 있도록 선언
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
