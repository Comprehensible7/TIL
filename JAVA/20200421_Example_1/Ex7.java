import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("�¾ �ظ� �Է��ϼ��� : ");
		int birth = sc.nextInt();

		String[] tti = { "������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��" };

		System.out.println(birth + "����� " + tti[birth % 12] + "�� �Դϴ� ");

	}

}
