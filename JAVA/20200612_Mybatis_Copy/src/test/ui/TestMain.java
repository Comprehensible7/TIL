package test.ui;

import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 회원가입 기능을 만들겠다.
		// 1. 회원 가입 데이터를 사용자로부터 입력받는다.
		Scanner sc = new Scanner(System.in);
		
		
		 System.out.print("이름을 입력해 주세요 : "); 
		 String name = sc.nextLine();
		 
		 System.out.print("나이를 입력해 주세요 : "); 
		 int age = sc.nextInt();
		 
		 // 2. 입력받은 데이터를 회원가입 객체에 저장한다. 
		 Person p = new Person(); 
		 p.setName(name);
		 p.setAge(age);
		 
		 // 3. 저장된 회원가입 객체를 DB에 전달한다. 
		 PersonDAO dao = new PersonDAO(); 
		 // 방금 입력받은 내용을 전달해준다.
		 dao.insertPerson(p);
		
		
		// 4. DB에서 전달받은 회원가입 객체를 insert 쿼리문을 사용해서 등록한다.
		// 실행한다.
		
		// 회원정보를 삭제하는 기능을 만들어보겠습니다.
		// 1. 사용자로부터 삭제하려는 회원의 pk(회원번호)를 입력받는다.
		System.out.print("삭제하려는 회원의 회원번호를 입력해 주세요 : ");
		int num = sc.nextInt();
		// 2. 입력받은 pk를 DB에 전달해서 delete 쿼리문을 실행한다.
//		PersonDAO dao = new PersonDAO();
		dao.deletePerson(num);
		
		
		
	}

}


// 생성순서

// 1.sql로 테이블 생성 (저장공간을 만들어줌)

// 2. vo생성 
// - 주의점 : 자료형은 실제 데이터베이스의 자료형과 다르니 가장 근접해있는 자료형 사용
// 			컬럼이름, 변수이름 동일하게 할 것

// 3. 마이바티스 설정
// mybatis-config.xml

// db.properties : 접속정보 등 확인가능
// 사용할 오라클 드라이버, 설치경로, 아이디 비밀번호 확인가능
// localhost, 아이디 비번은 유동적으로 변경가능

// 4. type alias 설정

// 5. DB접속정보 세팅 (복사해서 사용, 마이바티스 개발문서에도 있음)
// driver, url, username, password가 똑같이 작성되어있는지 양식을 확인

// 6. mapper를 확인
// Mapper.xml파일을 생성해야 등록가능

// 7. dao의 mybatisconfig.java를 생성
// mybatis-config.xml을 resource에 연결해줌
// mybatis와 sql사용할수있도록 해줌

// 8. Mapper.xml을 생성
// namespace는 dao의 mapper 인터페이스를 연결해줌
// ex)test.dao.PersonMapper를 연결

// 
