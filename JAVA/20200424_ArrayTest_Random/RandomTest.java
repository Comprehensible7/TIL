import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ ���� ����
		Random ran = new Random();
		
		// ������ ���� ����� ���� ���� �� ��ȣ ���ο� ���� ������ ��������
		// ���� 0���� ����ϹǷ� 9���� ���´�
		// +1�� ������� 1���� 10���� ���´�
		int num = ran.nextInt(10);
		
		System.out.println(num);
		
	}

}
