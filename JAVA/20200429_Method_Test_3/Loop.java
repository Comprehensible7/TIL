
public class Loop {
	
// ����������,��ȯ��, �޼����,		�Ű�����
	public void printLoopSum(int[] temp) {
		
		// temp �������� int�ڷ��� �迭�� ���� �� �ִ�.
		// int�ڷ��� �迭�� ����� �հ踦 ���ϰ� ����Ͻÿ�.
		
		int sum = 0;		// �հ踦 ������ ������ �ϳ� ����
		
		// �ݺ��� ���� - > 0���� �迭 ������ �ε������� 1�� �����ϴ� �ݺ���
		for(int i = 0; i<temp.length; i++) {
			sum += temp[i];
		}
		System.out.println("���޹��� �迭�� ����� ���� : " + sum);
	}
}
