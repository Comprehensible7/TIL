import java.util.Scanner;

public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int year;
		String str = null;
		
		System.out.print("�¾ �ظ� �Է��ϼ��� : ");
		year = input.nextInt();
		
		switch (year % 12) {
		case 0:
			str = "������";
			break;
		case 1:
			str = "��";
			break;
		case 2:
			str = "��";
			break;
		case 3:
			str = "����";
			break;
		case 4:
			str = "��";
			break;
		case 5:
			str = "��";
			break;
		case 6:
			str = "ȣ����";
			break;
		case 7:
			str = "�䳢";
			break;
		case 8:
			str = "��";
			break;
		case 9:
			str = "��";
			break;
		case 10:
			str = "��";
			break;
		case 11:
			str = "��";
			break;
		}

		System.out.println(year + "����� " + str + "�� �Դϴ�.");


	}

}
