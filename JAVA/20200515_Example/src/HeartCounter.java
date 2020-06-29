
public class HeartCounter {

	static int count;

	public HeartCounter() {
		count++;
		System.out.println("like : " + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HeartCounter hc1 = new HeartCounter();
		HeartCounter hc2 = new HeartCounter();
		System.out.println("total count : " + HeartCounter.count);

	}

}
