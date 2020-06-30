
import java.util.Scanner;

public class HumanMain {

	public static void main(String[] args) {
		
		Human[] array = new Human[100];
		String id, pw, name;
		int count = 0;
		int choice;
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=================");
			System.out.println("1. 등록");
			System.out.println("2. 출력");
			System.out.println("=================");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("ID 입력 : ");
				id = sc.next();
				System.out.print("PW 입력 : ");
				pw = sc.next();
				System.out.print("이름 입력 : ");
				name = sc.next();
				
				Human h = new Human();
				h.id = id;
				h.pw = pw;
				h.name = name;
				
				array[count] = h;
				count++;
				break;
			case 2:
				for(int i=0; i<count; i++) {
					System.out.println("ID : " + array[i].id);
					System.out.println("PW : " + array[i].pw);
					System.out.println("이름 : " + array[i].name);
				}
				break;
			case 0:
				return;
			}
			//
		}
	}
}







