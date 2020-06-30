
public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HumanManager hm = new HumanManager();
		
		// 값을 입력
		hm.insertStudent("홍길동", 20, 1);
		hm.insertStudent("김철수", 21, 2);
		hm.insertStudent("이영희", 22, 3);

		// 출력진행
		hm.showAll();
	}

}
