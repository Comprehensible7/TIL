import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("��_������?");
		int what = sc.nextInt();

		switch (what) {

		case 1:
			System.out.println("��Ʈ����");
			break;

		case 2:
			System.out.println("ȫ��");
			break;

		case 3:
			System.out.println("�Ƿ�Ƽ");
			break;

		case 4:
			System.out.println("ȭ���̾�_����");
			break;

		case 5:
			System.out.println("���Ǵ�");
			break;

		default:
			System.out.println("��_�԰�����Ŵ�...");
			break;
		}

	}

}
