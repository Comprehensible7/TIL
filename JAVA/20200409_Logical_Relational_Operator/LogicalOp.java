
public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��������
		int i = 10;
		
		// AND ������, �Ѵ� ���̸� ��, �� �ܿ��� ��� ����
		System.out.println((i != 0) && (100/i > 10));
		
		// OR ������, ���� �ϳ��� ���̸� ��, �Ѵ� �����̸� ����
		System.out.println((i == 10) || (100/i > 10));
		
		// XOR ������, A�� B�� �ٸ��� ��, ������ ����
//		System.out.println((i < 0) ^ (i ==10));
		
		// NOT ������, ���̸� ����, �����̸� ��
		System.out.println(!(i > 1));
		
		
		// ȥ�տ�����
		int a = 5;
		int b = 7;
		int c = 10;
		
		a+=b; // a = a+b, ���� ��
//		a-=b; // a = a-b, ���� ����
//		a*=b; // a = a*b, ���� ��
//		a/=b; // a = a/b, ���� ������
//		a%=b; // a = a%b, ���� ������
//		
//		a+=c; // a = a+c
		
		System.out.println(a);
		
	}

}
