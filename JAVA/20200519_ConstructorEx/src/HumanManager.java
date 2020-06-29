// 기능실행 담당
public class HumanManager {

	// 맴버변수 선언
	// 길이가 100인 student의 배열을 생성
	Student[] st = new Student[100];
	// 배열에서 사용해줄 순서
	int count = 0;
	
	// 메소드 생성					매개변수 선언
	public void insertStudent(String name, int age, int stNum) {
		// 초기화 진행
		
		// Student Class 객체 생성
		Student s = new Student(name, age, stNum);
		
		// st[count] = new Student(name, age, stNum);
		// st[count++] = new Student(name, age, stNum);
		
		// 생성한 배열에 생성한 객체를 넣는다
		st[count] = s;
		// 값이 들어간 후 증감식을 적용
		count++;
		
	}
	public void showAll() {
		
		// count를 하는 이유는 insert한 내용의 갯수를 체크하고있기때문에
		// st.length는 아니다.
		for(int i = 0; i<count; i++) {
			// 배열의 i번째를 showInfo해라
			st[i].showInfo();
		}
	}
}
