
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1���� 10���� 1�� �����ϴ� �ݺ���
		for(int i = 1; i<=10; i++) {
			
			// 1���� 10���� ��� ����Ѵ�
			// ���ǽ� ������ ��¹��� �����Ͽ� ���� ���������� �� ���´�
			System.out.println("Before = " + i);
			
			// i�� 5�϶��� ����϶�� ����
			// 5�� ���� ������� �ʴ´�
			if(i == 5) {
				continue;
			}
			
			System.out.println("After = " + i);
		}

	}

}
