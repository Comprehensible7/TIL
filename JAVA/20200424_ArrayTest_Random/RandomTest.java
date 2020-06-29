import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 무작위 숫자 생성
		Random ran = new Random();
		
		// 무작위 숫자 담아줄 변수 선언 및 괄호 내부에 숫자 범위를 지정해줌
		// 값은 0부터 계산하므로 9까지 나온다
		// +1을 했을경우 1부터 10까지 나온다
		int num = ran.nextInt(10);
		
		System.out.println(num);
		
	}

}
