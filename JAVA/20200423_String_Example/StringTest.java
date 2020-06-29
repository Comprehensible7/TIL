import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String Class를 우리가 사용할 수 있는 형태로 사용하면 String 자료형으로 사용할 수 있음
		// String의 자료형은 참조 자료형임
		// String은 Java에서 문자열을 저장할 수 있는 자료형
		
		Scanner sc = new Scanner(System.in);
		
		int num = 3;
		// 정수형 5개를 저장할 수 있는 배열
		int[] arrInt = new int[5];
		
		char c = '문';	// 기초자료형
		
		// 문자열 1개를 저장하는 변수
		// 문자열 입력받을때는 nextLine을 사용
		String str = sc.nextLine();	// 참조자료형
		
		// 문자열 5개를 저장할 수 있는 배열
		String[] arrStr = new String[5];
		
		System.out.println(str);
		
	}

}
