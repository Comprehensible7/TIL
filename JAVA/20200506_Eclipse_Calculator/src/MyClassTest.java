
// [���� ������] [Ŭ���� �̸�] (�Ű�����)
//		������ body

class MyClass {

	int age;
	// MyClass�� ������
	// Ŭ������ �̸��� ������ �̸��� ������ ��ȯ Ÿ���� �������� �ʴ´�.
	// �����ڰ� ȣ��� �� ���޹��� 20�� newAge�� �Ķ���ͷ� ���޵ȴ�.

	public MyClass(int newAge) {
		age = newAge;
	}
}

public class MyClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MyClass��ü�� �����ϸ鼭 �����ڿ� 20�� �����Ѵ�.
		MyClass mc = new MyClass(20);

		System.out.println("Age is : " + mc.age);
	}

}
