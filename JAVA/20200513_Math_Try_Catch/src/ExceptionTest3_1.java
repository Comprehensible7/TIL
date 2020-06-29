import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자가 정수를 입력할 때까지 계속해서 입력을 받는다.
		// 이때 정수를 입력하지 않으면 예외처리를 해준다.

		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("정수를 입력해 주세요 : ");
				int num = sc.nextInt();
				System.out.println("입력한 값은 : " + num + " 입니다.");
				flag = false;
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요! 다시 입력하세요.");
				sc.nextLine();
				
			// Exception이 발생한 file을 닫아주는 구문
			// DB와 연결을 끊어주는 구문
			// Try Catch문에 return이 있어도 수행한다
			} finally {
				System.out.println("무조건 실행되는 구문");
			}
		} while (flag);

	}

}
