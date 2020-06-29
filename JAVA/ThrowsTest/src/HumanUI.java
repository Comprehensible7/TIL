import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanUI {
	
	public void exec1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름를 입력해 주세요 : ");
		String name = sc.nextLine();
		int age = 0;
		double height = 0;
		
		while(true) {
			System.out.print("나이를 입력해 주세요 : ");
			try {
				age = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				//예외가 발생한 코드를 출력해준다.
				System.out.println("나이를 올바르게 입력해 주세요");
				sc.nextLine();
			}
		}
		
		while(true) {
			System.out.print("키(cm)를 입력해 주세요 : ");
			try {
				height = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				System.out.println("키를 올바르게 입력해 주세요");
				sc.nextLine();
			}
		}
		
		System.out.println("이름 : "+name+" 나이 : "+age+" 키 : "+height+"cm 입니다.");
	}
	
	
	public void exec2() throws InputMismatchException {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름를 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		System.out.print("키(cm)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.println("이름 : "+name+" 나이 : "+age+" 키 : "+height+"cm 입니다.");
	}
	
	
}
