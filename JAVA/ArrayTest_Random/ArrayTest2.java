
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2���� �迭�� ����� ����
		// ���п��� ���ϴ� �� ���� ������
		// �� 15���� �ݺ��Ѵ�
		int[][] iArrays = new int[3][5];

		// �迭�� length �Ӽ��� �̿��Ͽ� 2�� �迭�� ��ȸ�ϸ鼭 ���� �ʱ�ȭ
		int initVal = 0;
		System.out.println("iArrays.length > " + iArrays.length + "\n");

		// �ٱ��� �ִ� ������ ��ü�� ���°�
		// �պκ��� �迭�� ũ�� [3]�� ��Ÿ��
		// i�� 0~2���� 0, 1, 2
		for (int i = 0; i < iArrays.length; i++) {
			// ���ο� �ִ� ������ ���θ� ���°�
			// ���ʿ� �ִ� Ƚ����ŭ�� ���̰� ���� [5]
			// j�� 0~4���� 0, 1, 2, 3, 4
			for (int j = 0; j < iArrays[i].length; j++) {
				// 				�ݺ��� 1�� ������
				iArrays[i][j] = initVal++;

			}
		}

		// 2�� �迭�� ��ȸ�ϸ鼭 ���� ���
		for (int i = 0; i < iArrays.length; i++) {
			for (int j = 0; j < iArrays[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]:" + iArrays[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}

	}

}
