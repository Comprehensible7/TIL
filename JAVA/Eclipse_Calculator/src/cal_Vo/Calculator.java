package cal_Vo;

// ����� �� �� �ִ� Ŭ����
public class Calculator {

	public int sum;

	public int mins;

	public int multi;

	public double div;

	public double lef;

	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getMins() {
		return mins;
	}

	public void setMins(int mins) {
		this.mins = mins;
	}

	public int getMulti() {
		return multi;
	}

	public void setMulti(int multi) {
		this.multi = multi;
	}

	public double getDiv() {
		return div;
	}

	public void setDiv(double div) {
		this.div = div;
	}

	public double getLef() {
		return lef;
	}

	public void setLef(double lef) {
		this.lef = lef;
	}

	// �⺻������
	public Calculator() {

	}

	
	public int plus(int num1, int num2) {
		sum = num1 + num2;

		if (sum > 1000000) {
			System.out.println("=========================");
			System.out.println("   �հ� �������� Ů�ϴ�!!");
			System.out.println("=========================");
			// ���� �ʰ�������� 0���� ��ȯ �� ����
			return 0;
		}

		return sum;
	}

	// �׻� ū������ �������� ���°��� ��Ģ���� �Ѵ�.
	public int minus(int num1, int num2) {

		// num1�� num2���� ū ���
		if (num1 > num2) {
			mins = num1 - num2;

			// num2�� num1���� ū ���
		} else {
			mins = num2 - num1;
		}

		return mins;
	}

	public int multiple(int num1, int num2) {

		multi = num1 * num2;

		if (multi > 1000000) {
			System.out.println("=========================");
			System.out.println("     ���� ������ Ů�ϴ�!!");
			System.out.println("=========================");

			return 0;
		}

		return multi;
	}

	public double division(double num1, double num2) {

		div = num1 / num2;

		return div;
	}

	public double left(double num1, double num2) {
		lef = num1 % num2;

		return lef;
	}

}
