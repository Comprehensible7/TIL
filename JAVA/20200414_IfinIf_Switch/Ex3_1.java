import java.util.Scanner;

public class Ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("뭐 먹을래?");
		int what = sc.nextInt();

		switch (what) {

		case 1:
			System.out.println("민트초코");
			break;

		case 2:
			System.out.println("홍어");
			break;

		case 3:
		case 4:
			System.out.println("실론티 또는 화와이안 피자");
			break;

		case 5:
			System.out.println("솔의눈");
			break;

		default:
			System.out.println("뭘 먹고싶은거니...");
			break;
		}

	}

}
