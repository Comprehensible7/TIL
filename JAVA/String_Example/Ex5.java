
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {5, 3, 6, 7, 2, 4, 8};
		
		// �ִ밪
		int max = num[0];
		// �ּҰ�
		int min = num[0];

		// ������ �̹� 0��°�� �־�ξ��⶧���� ������ 1��°���� �Է����־ ��������
		for(int i = 1; i<num.length; i++) {
			if(max<num[i]) {
				// max�� ������ num[i]�� ũ�� max = num[i]
				max = num[i];
			}else if(min>num[i]) {
				// min�� ������ num[i]�� ������ min = num[i]
				min = num[i];
			}
			
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		}

	}


