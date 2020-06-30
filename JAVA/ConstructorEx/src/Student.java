// Vo역할
public class Student extends Human {

	// 학번
	private int stNum;

	public Student(String n, int a, int s) {
		// Human Class의 값을 초기화
		super(n, a);
		// Student의 학번 값
		stNum = s;
		// TODO Auto-generated constructor stub
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	
	@Override
	public void showInfo() {
		// 가지고있는 필드에 대한 정보를 출력
		// SuperClass의 직접적인 정보를 받아올 수 없으므로(private) get을 이용
		System.out.println("name : " + getName() + " age : " + getAge() + " stNum : " + stNum);
	}
	

}
