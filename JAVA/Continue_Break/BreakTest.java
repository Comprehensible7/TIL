
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i < 100; i++) {
			// 1 ~ 99 ���� 1�� �����ϴ� �ݺ���
			
			System.out.println("i = " + i);
			
		// ����� ������ ���� i���� 50�̶�� ����
		// ���� ��¹� ������ �Ʒ��� ������ ����� 50�϶� ���������� ����� 49�� ����
			if (i == 50) {
				break;
			}
		}
		
	}

}
