import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("태어난 해를 입력하세요 : ");
		int birth = sc.nextInt();

		String[] tti = { "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양" };

		System.out.println(birth + "년생은 " + tti[birth % 12] + "띠 입니다 ");

	}

}
