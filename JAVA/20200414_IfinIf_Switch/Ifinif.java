
public class Ifinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if문 내부의 if문을 사용하기 위해서는 첫번째 if문은 참이여야 실행가능하다

		int score = 95;

		// 중첩 if문을 사용하기 위해서는 첫번째 if문 조건이 참이여야 한다.
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+ 입니다.");
			} else {
				System.out.println("A- 입니다.");
			}
		} else {
			System.out.println("더 열심히 하세요");
		}

	}

}
