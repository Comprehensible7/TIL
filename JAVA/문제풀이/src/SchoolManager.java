
public class SchoolManager {

	// 배열 생성
	Human[] hArray = new Human[100];	// 회원정보가 등록 될 배열
	int count = 0;						// 등록 인원 카운트
	
	// 불린으로 생성, 매개변수는 Human
	// 매개변수 h는 지금 등록하려는 회원의 정보
	public boolean insertHuman(Human h) {
		// 이미 등록된 회원들의 정보중에서 지금 등록하려는 회원의 정보를 비교
		// 주민등록번호가 같은지를 비교한다.
		for(int i = 0; i<count; i++) {
			// 지금 배열에 들어있는 0번째 회원의 번호 ~ 증가
			// 주민등록번호가 같은지 비교하는 구문, 이때 True가 나오면 같은 주민등록번호가 있다.
			if((hArray[i].getSn().equals(h.getSn()))) {
				return false;
			}
		}
		
		// 결국 같은 주민등록번호를 찾지 못했을때는
		// 전달받은 회원의 정보를 배열에 넣고 true를 리턴해라
		hArray[count] = h;
		// 하나씩 증가시켜줘야한다
		count++;
		
		return true;
	}
	// Human 배열에 있는 모든 Human객체의 print메서드를 실행하라.
	public void printAll() {
		// 등록되어져 있는 모든 회원까지를 반복하는 반복문
		for(int i = 0; i<count; i++) {
			// 배열의 i값을 print한다. print 메서드를 실행
			hArray[i].print();
		}
	}
}
