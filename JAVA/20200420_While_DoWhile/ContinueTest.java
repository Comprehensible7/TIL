
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;

		while (num < 100) {
			num++;

			// ¦������ �Ǵ��ϴ� ���ǹ�
			// ¦���ϰ�� continue�϶�� ���ǹ�
			// ¦���� �����ϰ� Ȧ���� ��µȴ�
			if (num % 2 == 0) {
				continue;
			}
			System.out.println("num = " + num);
		}

	}

}
