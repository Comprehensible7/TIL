import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10~50 �迭 ����
		int[] ary = {10, 20, 30, 40, 50};
		// �������� ����
		Random ran = new Random();
		// �迭������ �������� �޾ƿ� idx ����...
		int idx = ran.nextInt(5);
		// �迭 ������ idx���� �޾ƿ´�
		System.out.println(ary[idx]);
	}

}
