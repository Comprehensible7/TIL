
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Customer[] array = new Customer[100];
		String name, carNum, phone, place;
		int choice, count = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		
		while(flag) {
			System.out.println("=================");
			System.out.println("1. 예약");
			System.out.println("2. 조회");
			System.out.println("3. 전체출력");
			System.out.println("4. 프로그램 종료");
			System.out.println("=================");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("차 번호 : ");
				carNum = sc.next();
				System.out.print("전화번호 : ");
				phone = sc.next();
				System.out.print("위치 : ");
				place = sc.next();
				Customer c = new Customer(name, phone, carNum, place);
				array[count] = c;
				count++;
				break;
			case 2:
				System.out.print("전화번호 : ");
				phone = sc.next();
				boolean result = false;
				for(int i=0; i<count; i++) {
					if(array[i].phone.equals(phone)) {
						result = true;
						System.out.println("이름 : " + array[i].name);
						System.out.println("차 번호 : " + array[i].carNum);
						System.out.println("전화번호 : " + array[i].phone);
						System.out.println("위치 : " + array[i].place);
					}
				}
				if(result == false) System.out.println("일치하는 정보가 없습니다");
				break;
			case 3:
				for(int i=0; i<count; i++) {
					System.out.println("===============");
					System.out.println("이름 : " + array[i].name);
					System.out.println("차 번호 : " + array[i].carNum);
					System.out.println("전화번호 : " + array[i].phone);
					System.out.println("위치 : " + array[i].place);
				}
				break;
			case 4:
				flag = false;
				break;
			}
		}
		//
	}

}
