package test.ui;

import test.manager.TestManager;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestManager tm = new TestManager();
		
		tm.startFunc();
		
	}

}


//생성순서

//1.sql로 테이블 생성 (저장공간을 만들어줌)

//2. vo생성 
//- 주의점 : 자료형은 실제 데이터베이스의 자료형과 다르니 가장 근접해있는 자료형 사용
//			컬럼이름, 변수이름 동일하게 할 것

//3. 마이바티스 설정
//mybatis-config.xml
// vo생성 후 typeAlias를 설정해준다.
// type, alias, 별칭을 지정해준다, personMapper부분에서 parameterType지정 시 사용

//db.properties : 접속정보 등 확인가능
//사용할 오라클 드라이버, 설치경로, 아이디 비밀번호 확인가능
//localhost, 아이디 비번은 유동적으로 변경가능

//4. type alias 설정

//5. DB접속정보 세팅 (복사해서 사용, 마이바티스 개발문서에도 있음)
//driver, url, username, password가 똑같이 작성되어있는지 양식을 확인

//6. mapper를 확인
//personMapper.xml파일을 생성해야 등록가능

//7. dao의 mybatisconfig.java를 생성
//mybatis-config.xml을 resource에 연결해줌
//mybatis와 sql사용할수있도록 해줌

//8. Mapper.xml을 생성
//namespace는 dao의 mapper 인터페이스를 연결해줌
//ex)test.dao.PersonMapper를 연결

