import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ڹٰ� �̸� ������ Ŭ���� Scanner
		
		 // sc�� �ĺ���, ��ĳ�ʸ� �����ϴ� �̸��� ������� ���� ���� 
		 Scanner sc = new Scanner(System.in); // import�ؿ� Scanner�� ����� �� �ִ� ���·� ���� ��
		 
		 //nextInt�� method 
		 int num = sc.nextInt(); // ����� �� �ִ� ����, �� sc�� ����ؼ� �������� �Է¹޴� ��
		 int num2 = sc.nextInt();
		 
		 int num3 = num + num2;
		 
		 System.out.println(num3);
		  
		 System.out.println(num + num2); 
		 System.out.println(num - num2);
		 System.out.println(num * num2); 
		 System.out.println(num / num2);
		 System.out.println(num % num2);
		 
		//					 4 3 4	1  2
		System.out.println(10+2*3-(5/2)%3);
		//					10  6 -	2  2 = 6-2+10
	
	}


}
