
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����
		int[] base = { 11, 12, 13, 14, 25, 30, 53, 65, 68, 77 };
		// �����ڷ�
		// �Ʒ��� ���� �Է� �� base�� ���� �� copy���� ����ǹǷ� ����ó�� ����ϰ� �ȴ�
		// int[] copy = base;
		
		// length�� �״�� �����;� �������� ������ �Ȼ���
		int[] copy = new int[base.length];

		// ���� �����ϱ� ���� ����
		for(int i=0; i<base.length; i++) {
			// ���̽��� �ִ� ���� ī�Ƿ� ����
			// ������ �ڹٲ� ��� 0�� ����
			copy[i] = base[i];
		}
		
		System.out.print("�����ڷ� : ");
		// ������ ���� ��°�
		// i���� �ݺ�����
		for (int i = 0; i < base.length; i++) {
			// i�� base�� length��ŭ ������Ų ���� ����Ѵ�
			System.out.print(base[i] + " ");

		}
		// �ٹٲ�
		System.out.println();

		System.out.print("���纻 : ");
		// �����ڷ� ��°�
		for (int i = 0; i < copy.length; i++) {
			// i�� copy�� length��ŭ ������Ų ���� ����Ѵ�
			System.out.print(copy[i] + " ");
		}

	}

}
