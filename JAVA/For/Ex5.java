import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 철수는 가게에서 물건을 구매하였다. 
		 * 물건의 가격과 철수가 지불한 금액을 입력 받아 
		 * 지불에 필요한 5만원권, 만원 권, 5천원권, 천원권의
		 * 최소 개수와 나머지 금액 구하여 출력하시오.
		 * 
		 * 실행 시 보여지는 화면은 상품가격을 입력하세요 : 
		 * 123540 123540원은 5만원권 2장, 만원권 2장, 5천원권 0장, 천원권 3장을
		 * 지불하고 540원이 남습니다. 이렇게 됩니다.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int price, n50, n10, n5, n1, rest;
		System.out.println("상품 가격 > ");
		price = input.nextInt();

		// 남은금액
		rest = price;
		
		// 지폐금액
		
		// 몫으로 계산
		n50 = rest / 50000;
		// 나머지 금액을 계산
		rest = rest % 50000;
		
		n10 = rest / 10000;
		rest = rest % 10000;
		
		n5 = rest / 5000;
		rest = rest % 5000;
		
		n1 = rest / 1000;
		rest = rest % 1000;
		
		System.out.println(price + " 원 ");
		System.out.println(" 5만원권 " + n50 + " 장 ");
		System.out.println(" 1만원권 " + n10 + " 장 ");
		System.out.println(" 5천원권 " + n5 + " 장 ");
		System.out.println(" 1천원권 " + n1 + " 장을 지불하고 ");
		System.out.println(rest + " 원이 남습니다 ");
	}

}
