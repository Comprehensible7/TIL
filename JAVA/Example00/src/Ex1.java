import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

//		사용자로부터 문자열을 입력받고
//		입력받은 문자열을 반대로 출력하는 코드를 작성하시오. 
//		ex ) Hello World 를 입력받으면
//		dlroW olleH 가 출력되는 겁니다.

		System.out.println();

		System.out.print("문자열을 입력하세요 : ");
		String hw = sc.nextLine();

		// 반복문 사용, 스캐너로 값을 받은 변수 hw.legnth에 -1을 입력
		// -1을 지정한 이유는 Hello World에서 d부터 읽을수있게 한다
		// i>=0인것은 입력값이 더 크기때문, 감산식의 경우는 반대로 출력할때 하나씩 줄어들게하기위함
		for (int i = hw.length() - 1; i >= 0; i--) {
			// 입력한 hw의 값에 i번째 값을 돌려준다
			System.out.print(hw.charAt(i));
		}

		System.out.println();


		System.out.print("문자열을 입력하세요 : ");
		String hw2 = sc.nextLine();

		StringBuffer sb = new StringBuffer();
		sb.append(hw2);

		System.out.println(sb.reverse());

		System.out.println();

		
		// 배열을 생성하여 문자열 뒤집기
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		// 문자열 길이를 반환
		int length = str.length();

		// 배열의 길이를 지정, 위의 스트링 길이만큼 인트로 변환해줌
		char[] oldChar = new char[length];
		char[] newChar = new char[length];

		for (int i = 0; i < length; i++) {
			oldChar[i] = str.charAt(i);
		}

		for (int i = 0; i < length; i++) {
			newChar[length - 1 - i] = oldChar[i];
		}

		for (int i = 0; i < length; i++) {
			System.out.print(newChar[i]);
		}

	}

}
