
public class OverloadingMain {
	
	public static void main(String[] args) {
		//1
		Calculator cal = new Calculator();
		int sum1 = cal.add(10, -50);
		double sum2 = cal.add(30.32, 1.46);
		System.out.println(sum1);
		System.out.println(sum2);
		
		//2
		Product[] pArr = new Product[3];		// �迭�ȿ� �� �� �ִ� �ڷ�����?
												// Product, Product�� ��ӹ��� �ڽ� Ŭ����
		Product p1 = new Product();
		p1.setName("���");
		p1.setPrice(7000);
		
		Product p2 = new Product("��");
		Product p3 = new Product("��", 5000);
		
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i]);
		}
		
		// 1. ��ü�� ����ϸ� �ּҰ��� ��µȴ�.
		// 2. product Ŭ�������� toString�޼ҵ带 �������̵� �ߴ��� ��������� ���� ����.
		// 3. toString�޼ҵ�� ObjectŬ�����κ��� �������̵� �� �޼ҵ��
		// - > Object�� toString�޼ҵ�� �ּҰ��� ����Ѵ�.
		
	}
	
}
