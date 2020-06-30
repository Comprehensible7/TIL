
public class SchoolManager {

	private Human[] arr = new Human[100];		// 이미 등록되어 있는 회원 정보 (Human, Student, Staff, Professor)
	private int count = 0;						// 회원정보가 등록이 되면 몇명의 회원이 등록되었는지 판단하기 위해서 카운팅하는 변수
	
	public boolean insertHuman(Human h) {		// 지금 등록하려는 회원정보(아직 등록 안함)
		

		// 1번 방식
		
		/*
		 * for(int i=0; i<count; i++) { Human temp = arr[i];
		 * 
		 * // boolean result = h.getSn().equals(temp.getSn()); // return !result;
		 * if(h.getSn().equals(temp.getSn())) return false; }
		 */
		
		// 2번 방식
		
		boolean check = findHuman(h.getSn()) == null ? false : true;		// 삼항연산자 사용
		
		if(check) {
			return false;
		}
		
		
		
		
		// if문이 실행이 된다는건 전달받은 객체가 학생이다
		if(h instanceof Student) {
			Student s1 = (Student)h;					// human일때는 human이 가지고 있는 멤버변수와 메소드를 사용할 수 있었는데
														// Student로 객체 형변환을 하게 되면 Student가 가지고 있는 멤버변수와 메소드도 사용이 가능하다
			for(int i=0; i<count; i++) {
				Human temp = arr[i];					// 배열 내부에는 Human, Student, Professor, Staff 4종류가 들어갈 수 있다.
				
				if(temp instanceof Student) {
					Student s2 = (Student)temp;
					
//					boolean result = s1.getSsn().equals(s2.getSsn());
//					return !result;
					if(s1.getSsn().equals(s2.getSsn())) return false;
				}
			}
		}
		
		arr[count++] = h;
		return true;
	}
	
	public Human findHuman(String sn) {
		for(int i=0; i<count; i++) {
			Human temp = arr[i];			// 배열내부의 값과 일치하는지 확인
			
			if(sn.equals(temp.getSn())) return temp; 	// 일치한다면 출력
		}
		
		return null;									// 없다면 null 
	}
	
	// 배열공부를 많이 했어야 만들 수 있는 기능
	// 배열에는 값을 대입하는것만 가능하다, 삭제라는 기능은 존재하지 않음
	
	public boolean deleteHuman(Human h) {
		for(int i=0; i<count; i++) {		// 배열이 가지고 있는 회원정보의 내용
			if(arr[i] == h) {				// 전달받은 객체하고 배열에있는 객체하고 == 비교를 한다 (주소값이 같은것을 찾는다)
											// 배열의 값과 h값이 일치한다면
				for(int j=i; j<count-1; j++) {	// for(int j = 1; j<2; j++){arr[1]=arr[2];} 3에서 2로
					arr[j] = arr[j+1];			// for(int j = 2; j<2; j++){} 2에서 3으로간다, 값을 덮어씌움
				}
				count--;						// 배열의 카운트를 하나 줄여준다, 하나줄어들고 다음 출력시 값이 들어올때 덮어씌우기가 되어서 새로운 값이 들어간다
				return true;
			}
		}
		
		return false;
	}
	
	public void printAll() {
		
		for(int i=0; i<count; i++) {
			System.out.println();
			arr[i].print();
		}
	}
}
