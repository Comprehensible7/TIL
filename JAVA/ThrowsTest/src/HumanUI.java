import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanUI {
	
	public void exec1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		int age = 0;
		double height = 0;
		
		while(true) {
			System.out.print("���̸� �Է��� �ּ��� : ");
			try {
				age = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				//���ܰ� �߻��� �ڵ带 ������ش�.
				System.out.println("���̸� �ùٸ��� �Է��� �ּ���");
				sc.nextLine();
			}
		}
		
		while(true) {
			System.out.print("Ű(cm)�� �Է��� �ּ��� : ");
			try {
				height = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Ű�� �ùٸ��� �Է��� �ּ���");
				sc.nextLine();
			}
		}
		
		System.out.println("�̸� : "+name+" ���� : "+age+" Ű : "+height+"cm �Դϴ�.");
	}
	
	
	public void exec2() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt();
		System.out.print("Ű(cm)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.println("�̸� : "+name+" ���� : "+age+" Ű : "+height+"cm �Դϴ�.");
	}
	
	
}
