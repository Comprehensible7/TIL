
public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭�� �����Ҷ� ���� �����ؼ� �����ϴ� ��� �Դϴ�.
		int[] arr = { 11, 12, 13, 14, 25, 30, 54, 65, 68, 77 };
		// ����迭�� ���鶧 ũ�� ���� �ϴ°��� �����迭 ������.length ����� �߿��մϴ�.
		int[] copyArr = new int[arr.length];

		// ��� ������ ������ ���� �����ϴ°�����!
		for (int i = 0; i < arr.length; i++) {
			copyArr[i] = arr[i];
		}

		System.out.print("���� �迭 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("���纻 : ");
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

	}

}
