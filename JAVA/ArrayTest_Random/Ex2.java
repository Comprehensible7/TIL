import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 무작위 수 생성...
		// Random Class를 사용할 수 있는 형태로 만든것
		Random ran = new Random(); 

		// 무작위 값 받아옴과 동시에 출력 진행... 1이상 10 이하...
		System.out.println(ran.nextInt(10) + 1);

	}

}
