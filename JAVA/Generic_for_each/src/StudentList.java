import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 		   엘리먼트 -> 저장하려는 타입을 작성해주면됨.
		// 제네릭은 클래스 이름을 적음
		// 숫자형을 적을려면 int대신에 Integer를 적어줘야함
		// Java 1.6버전에서는 제네릭 사용시 앞 뒤에 모두 명시를 해줬어야함
		// 1.8 이후는 뒤에 명시하지 않아도 사용가능 <Student 생략가능>
		
		// 어레이 리스트는 제네릭을 사용, 사이즈 지정 안함
		ArrayList<Student> studentList = new ArrayList<>();
		
		// 배열 사용
		// 사이즈 지정 필요
		Student[] sArray = new Student[3];
		
		// 배열, 리스트에 데이터 입력
		Student s1 = new Student("홍길동", 90);
		Student s2 = new Student("이길동", 80);
		Student s3 = new Student("삼길동", 100);
		
		// 리스트 사용
//		studentList.add(new Student("홍길동", 90));
//		studentList.add(new Student("이길동", 80));
//		studentList.add(new Student("삼길동", 100));
		
		// 리스트에서 데이터를 저장할때
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		// 배열에서 데이터를 저장할 때
		sArray[0] = s1;
		sArray[1] = s2;
		sArray[2] = s3;
		
		System.out.println("향상된 for문");
		// 향상된 for문 - for each문
		for(Student s : studentList) {
			System.out.println(s.getName()+ s.getScore());
		}
		
		System.out.println();
		System.out.println("리스트 출력");
		// 리스트에서 출력 구문			 얘는 메소드임, size();
		for(int i = 0; i < studentList.size();i++) {
			System.out.println("이름 : " + studentList.get(i).getName()
					+ " , 점수 : " + studentList.get(i).getScore() + " 점");
		}
		System.out.println();
		System.out.println("배열 출력");
		// 배열에서 출력 구문		  length라는 속성으로 배열크기를 얻어옴
		for(int i = 0; i < sArray.length; i++) {
			System.out.println("이름 : " + sArray[i].getName()
					+ " , 점수 : " + sArray[i].getScore() + " 점");
		}
		
		System.out.println();
		System.out.println("비어있는지 확인");
		// ArrayList에 데이터가 있는지를 확인하는 것
		// empty가 아니기때문에 false가 나온다
		boolean check = studentList.isEmpty();
		System.out.println(check);
		
		// 리스트상에 1번을 지운다
		studentList.remove(1);
		
		System.out.println();
		System.out.println("삭제");
		// 리스트에서 출력 구문			 얘는 메소드임, size();
		for(int i = 0; i < studentList.size();i++) {
			System.out.println("이름 : " + studentList.get(i).getName()
				+ " , 점수 : " + studentList.get(i).getScore() + " 점");
			}
		
		// 리스트 비우기(초기화)
		System.out.println();
		System.out.println("리스트 초기화");
		studentList.clear();
		boolean check2 = studentList.isEmpty();
		System.out.println(check2);
		
	
	}

}
