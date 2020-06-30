import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10~50 배열 생성
		int[] ary = {10, 20, 30, 40, 50};
		// 랜덤변수 생성
		Random ran = new Random();
		// 배열내부의 랜덤값을 받아올 idx 생성...
		int idx = ran.nextInt(5);
		// 배열 내부의 idx값을 받아온다
		System.out.println(ary[idx]);
	}

}
