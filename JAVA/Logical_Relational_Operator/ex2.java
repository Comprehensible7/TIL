import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("첫번째 점수를 입력하세요 > ");
			int sum1 = sc.nextInt();
			System.out.println("두번째 점수를 입력하세요 > ");
			int sum2 = sc.nextInt();
			System.out.println("세번째 점수를 입력하세요 > ");
			int sum3 = sc.nextInt();
			
			int avg = (sum1 + sum2 + sum3) / 3;
			int total = sum1 + sum2 + sum3;
			
			
			System.out.printf("sum1의 점수는 %d점, sum2의 점수는 %d점, sum3의 점수는 %d점.", sum1, sum2, sum3);
			System.out.printf("\n총점은 %d점 입니다.", total);
			System.out.printf("\n평균 점수는 %d 입니다.\n", avg);
			
			if(avg >=80 ) {
				System.out.println("true");
			}else { 
				System.out.println("false");
			}
			

	}

}
