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
				System.out.println("���Ŀ� ���� �ʴ� �Է��Դϴ�. ó������ �ٽ� �Է��ϼ���.");
			}
		}
		
	}
}
