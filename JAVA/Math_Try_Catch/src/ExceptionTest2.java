import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자가 정수를 입력할 때 까지 계속해서 입력을 받는다.
		// 이때 정수를 입력하지 않으면 예외처리를 해준다.

		Scanner sc = new Scanner(System.in);
		
		int num;

		while (true) {

			try { // 예외가 발생할 소지가 있는 코드
				
				System.out.print("Insert Number : ");
				num = sc.nextInt();

				System.out.println();
				System.out.println("Result is : " + num);
				break;

				
			} catch (InputMismatchException e) {
				// TODO Auto-generated catch block

				System.out.println();
				System.out.printf("Please check your result... お願い!" + "\n");
				
				// 초기화
				sc.nextLine();

			} finally {
				System.out.println("Definitely working on this comment or finally section");
			}
			// 정수를 입력받을때까지 do while문 또는 while문 사용해서 작성해보기
			// 써도그만 안써도 그만임, 선택은 자유
			// } finally {
			// 예외처리와 상관없이 무조건 실행 될 코드
			// }
			// 예외 발생시 처리하는 부분
			// catch가 실행되는 동안은 Program이 종료되지 않는다.
			// 예외클래스명 + 변수명

		}

//		InputMismatchException : 지정한 변수 타입과 다른 타입을 입력받았을 때 발생하는 예외
//
//		ArithmeticException : 0으로 나누려할 때 발생하는 예외
//
//		NullPointerException : 값이 null인 참조변수의 멤버를 호출하려고 할때 발생하는 예외
//
//		ArrayIndexOutOfBoundsException : 배열의 범위를 벗어났을 때 발생하는 예외
//
//		NumberFormatException : 문자를 숫자로 변환하려고 할 때 발생하는 예외
//
//		FileNotFoundException : 존재하지 않는 파일의 이름을 입력했을 때 발생하는 예외
//
//		ClassNotFoundException : 클래스 로딩에 실패했을 때 발생하는 예외

	}

}
