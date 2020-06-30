import java.util.Scanner;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;

		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("정수를 입력해 주세요 : ");
				int num = sc.nextInt();
				System.out.println("입력한 값은 : " + num + " 입니다.");
				flag = false;
			} catch (Exception e) {
				System.out.println("정수를 입력하세요! 다시 입력하세요.");
			}
		} while (flag);

	}

}
