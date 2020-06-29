import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("¹¹_¸ÔÀ»·¡?");
		int what = sc.nextInt();

		switch (what) {

		case 1:
			System.out.println("¹ÎÆ®ÃÊÄÚ");
			break;

		case 2:
			System.out.println("È«¾î");
			break;

		case 3:
			System.out.println("½Ç·ĞÆ¼");
			break;

		case 4:
			System.out.println("È­¿ÍÀÌ¾È_ÇÇÀÚ");
			break;

		case 5:
			System.out.println("¼ÖÀÇ´«");
			break;

		default:
			System.out.println("¹»_¸Ô°í½ÍÀº°Å´Ï...");
			break;
		}

	}

}
