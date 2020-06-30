package cal_Manager;

import java.util.Scanner;

import cal_Vo.Calculator;

//[���� ������] [Ŭ���� �̸�] (�Ű�����)
//		������ body

public class MainClass_Custom_Cal {

	// Calculator�� ���� ����ϱ����� cal�� �������ְ� �����ڸ� �������ش�
	Calculator cal = new Calculator();
	// ����ڿ��� ���� �޾ƿ������� ��ĳ�� ����
	Scanner sc = new Scanner(System.in);
	// ���� �Է¹��� ���� ����
	int num1, num2;

	public void selectInfo() {

		ins_Num();

		do {

			// ������ �޼��峻�� �� ����� �ҷ��´�
			printMenu();

			System.out.print("�޴� ��ȣ�� ������ �ּ��� > ");
			// ����ġ�� �Է¹��� �ڵ带 ���� ��������
			int code = sc.nextInt();

			switch (code) {

			case 1:

				plus();

				break;

			case 2:

				minus();

				break;

			case 3:

				multiple();

				break;

			case 4:

				division();

				break;

			case 5:

				left();

				break;

			case 6:

				printAll_Res(cal);

				break;

			case 9:
				System.out.println("����� �����մϴ�.");
				System.exit(0);

			default:
				System.out.println("�ùٸ� ���� �Է��ϼ���.");
				break;
			}

			System.out.println();

		} while (true);

	}

	public void printMenu() {

		System.out.println("====================");
		System.out.println("1. Sum ���");
		System.out.println("2. Minus ���");
		System.out.println("3. Multiple ���");
		System.out.println("4. Division ���");
		System.out.println("5. Left ���");
		System.out.println("6. ��ü ���");
		System.out.println("9. ����");
		System.out.println("====================");
		System.out.printf("\n");

	}

	public void printAll_Res(Calculator cal) {

		System.out.println();

		System.out.println("----------");
		System.out.println("| + : " + cal.getSum());
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("| - : " + cal.getMins());
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("| * : " + cal.getMulti());
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("| / : " + cal.getDiv());
		System.out.println("----------");

		System.out.println("----------");
		System.out.println("| % : " + cal.getLef());
		System.out.println("----------");

	}

	public void ins_Num() {

		System.out.println();
		System.out.print("| ù��° ������ �Է��� �ּ��� | : ");
		num1 = sc.nextInt();

		System.out.print("| �ι�° ������ �Է��� �ּ��� | : ");
		num2 = sc.nextInt();
		System.out.println();

	}

	public void plus() {

		System.out.println("----------");
		System.out.println("| + : " + cal.plus(num1, num2));
		System.out.println("----------");

	}

	public void minus() {

		System.out.println("----------");
		System.out.println("| - : " + cal.minus(num1, num2));
		System.out.println("----------");
	}

	public void multiple() {

		System.out.println("----------");
		System.out.println("| * : " + cal.multiple(num1, num2));
		System.out.println("----------");
	}

	public void division() {

		System.out.println("----------");
		System.out.println("| / : " + cal.division(num1, num2));
		System.out.println("----------");
	}

	public void left() {

		System.out.println("----------");
		System.out.println("| % : " + cal.left(num1, num2));
		System.out.println("----------");
	}

}
