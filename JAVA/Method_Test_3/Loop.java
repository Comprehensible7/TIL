
public class Loop {
	
// 접근지정자,반환값, 메서드명,		매개변수
	public void printLoopSum(int[] temp) {
		
		// temp 변수에는 int자료형 배열의 값이 들어가 있다.
		// int자료형 배열의 요소의 합계를 구하고 출력하시오.
		
		int sum = 0;		// 합계를 저장할 변수를 하나 선언
		
		// 반복문 실행 - > 0부터 배열 마지막 인덱스까지 1씩 증가하는 반복문
		for(int i = 0; i<temp.length; i++) {
			sum += temp[i];
		}
		System.out.println("전달받은 배열의 요소의 합은 : " + sum);
	}
}
