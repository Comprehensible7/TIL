import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// �⺻ �迭
		int[] ary = { 20, 25, 30, 10, 15, 5 };
		// ������ ���� ��������
		int chg1, chg2, temp;

		System.out.print("ù��° �ε��� ��ȣ > ");
		chg1 = sc.nextInt();
		System.out.print("�ι�° �ε��� ��ȣ > ");
		chg2 = sc.nextInt();

		// �ӽú����� ���� ����
		// 1 -> 2 // 2 -> 3 // 3 -> 1 
		temp = ary[chg1];
		ary[chg1] = ary[chg2];
		ary[chg2] = temp;

		System.out.print("�ٲ� �迭 > ");
		for (int i = 0; i < ary.length; i++) {
			// �迭 ���
			System.out.print(ary[i] + " ");

			}
			
		}
	}


