import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("ù��° ������ �Է��ϼ��� > ");
			int sum1 = sc.nextInt();
			System.out.println("�ι�° ������ �Է��ϼ��� > ");
			int sum2 = sc.nextInt();
			System.out.println("����° ������ �Է��ϼ��� > ");
			int sum3 = sc.nextInt();
			
			int avg = (sum1 + sum2 + sum3) / 3;
			int total = sum1 + sum2 + sum3;
			
			
			System.out.printf("sum1�� ������ %d��, sum2�� ������ %d��, sum3�� ������ %d��.", sum1, sum2, sum3);
			System.out.printf("\n������ %d�� �Դϴ�.", total);
			System.out.printf("\n��� ������ %d �Դϴ�.\n", avg);
			
			if(avg >=80 ) {
				System.out.println("true");
			}else { 
				System.out.println("false");
			}
			

	}

}
