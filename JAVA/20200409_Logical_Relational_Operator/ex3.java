import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �����ڷ�
		// char �� ���� �� 
		// char c = ((num%2)==0) ? '¦' : 'Ȧ' ; 
		
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		System.out.println("�������� �������� > ");
		
		a = sc.nextInt();

		// Ȧ���� a%2==1 (a�� 2�� ���� ������) 1�� ����� ���������� Ȧ���̰� ���� 1�� ���ٸ� Ȧ��
		// ¦���� a%2==0 (a�� 0���� ���� ������) 0�� ����� ���������� ¦���̰� ���� 0�� ���ٸ� ¦��
		// % ���� ������ ���� ���, == a�� b�� ����
		// a�� 
		if(a%2==1) {
			System.out.println("Ȧ��");
		}else {
			System.out.println("¦��");

		}
	
	}

}
