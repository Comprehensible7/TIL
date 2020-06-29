import java.util.InputMismatchException;

public class HumanMain {

	public static void main(String[] args) {
		HumanUI ui = new HumanUI();
		//ui.exec1();
		
		while(true) {
			try {
				//ui.exec2();
				break;
			}catch (InputMismatchException e) {
				System.out.println("형식에 맞지 않는 입력입니다. 처음부터 다시 입력하세요.");
			}
		}
		
	}
}
