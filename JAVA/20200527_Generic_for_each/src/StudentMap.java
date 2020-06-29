import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 앞이 키값, 뒤가 밸류값
		// Integer말고도 String같은거도 사용가능하다
		HashMap<Integer, Student> studentMap = new HashMap<>();
	
		//		  데이터를 넣는것
		studentMap.put(1, new Student("일길동", 90));
		studentMap.put(2, new Student("이길동", 90));
		studentMap.put(3, new Student("삼길동", 90));
		studentMap.put(4, new Student("사길동", 90));

		// 하나의 값을 지정하여 출력
		// 해쉬맵은 크기가 없이 무작위라 포문 안돌림
		System.out.println(studentMap.get(3).getName());
		System.out.println();
		
		// map에서 사용하는 향상된 for문
		// 키값을 지정, StudentMap의 정보를 받아온다
		Set<Integer> keys2 = studentMap.keySet();
		// 향상된 for문 -> for each문
		for(Integer s : keys2) {
			System.out.println("이름 : " + studentMap.get(s).getName()
					+ " 점수 : " + studentMap.get(s).getScore() );
			
		}
		
		System.out.println();
		ArrayList<String> sList = new ArrayList<>();
		sList.add("aaa");
		sList.add("bbb");
		sList.add("ccc");
		
		System.out.println("일반적인 For문");
		// 일반적인 for문
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		System.out.println();
		
		// : 기준으로 오른쪽은 반복을 시켜야 하는 대상, sList의 타입은 ArrayList
		// sList의 타입 ArrayList 내부에 들어가있는 종류는 String
		// : 기준으로 왼쪽은 오른쪽의 데이터를 반복했을때 생성되는 데이터
		System.out.println("For_Each문");
		for(String s : sList) {
			// 바로 s를 입력하면 다 출력해준다
			System.out.println(s);
		}
		System.out.println();
		
		// 키를 정확히 알고있을때만 사용
		Set<Integer> keys = studentMap.keySet();
		
		// 향상된 for문 -> for each문
		// 무조건 처음부터 끝까지를 실행시켜주는 반복문이다. 갯수에 상관없이
		for (Integer i : keys) {
			System.out.println("이름 : " + studentMap.get(i).getName()
					+ " , 점수 : " + studentMap.get(i).getScore());
		}
	}

}
