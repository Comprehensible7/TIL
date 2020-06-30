package cal_Vo;

// 계산을 할 수 있는 클래스
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

	// 기본생성자
	public Calculator() {

	}

	
	public int plus(int num1, int num2) {
		sum = num1 + num2;

		if (sum > 1000000) {
			System.out.println("=========================");
			System.out.println("   합계 계산범위가 큽니다!!");
			System.out.println("=========================");
			// 값이 초과했을경우 0으로 반환 후 종료
			return 0;
		}

		return sum;
	}

	// 항상 큰값으로 작은값을 빼는것을 원칙으로 한다.
	public int minus(int num1, int num2) {

		// num1이 num2보다 큰 경우
		if (num1 > num2) {
			mins = num1 - num2;

			// num2가 num1보다 큰 경우
		} else {
			mins = num2 - num1;
		}

		return mins;
	}

	public int multiple(int num1, int num2) {

		multi = num1 * num2;

		if (multi > 1000000) {
			System.out.println("=========================");
			System.out.println("     곱셈 범위가 큽니다!!");
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
