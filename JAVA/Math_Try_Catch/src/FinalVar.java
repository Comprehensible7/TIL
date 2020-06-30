
// final의 경우는 더이상의 변형은 없다고 생각하면 됨, 말그대로 마지막
// modifier로 사용되며 보안적 의도에 의하여 변형을 막겠다라는 의미를 가지고 있음
// final은 절대 변하지 않도록, static은 상수가 공유될 수 있도록 하기위해 사용됨

public class FinalVar {

	final int i = 9;

	public void go() {
		// final 키워드가 붙은 변수는 선언시에만 초기화가 가능
		// i = 10; -> error
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // 위의 메서드는 static이 아니라서 위의 클래스를 객체화 후 입력을 진행한다
		 FinalVar fv = new FinalVar(); 
		 fv.go();
		 
		
//		int[] arr = new int[10];
//		
//		System.out.println(arr[10]);
		
	}

}
