
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
			System.out.println("1. ����");
			System.out.println("2. ��ȸ");
			System.out.println("3. ��ü���");
			System.out.println("4. ���α׷� ����");
			System.out.println("=================");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("�̸� : ");
				name = sc.next();
				System.out.print("�� ��ȣ : ");
				carNum = sc.next();
				System.out.print("��ȭ��ȣ : ");
				phone = sc.next();
				System.out.print("��ġ : ");
				place = sc.next();
				Customer c = new Customer(name, phone, carNum, place);
				array[count] = c;
				count++;
				break;
			case 2:
				System.out.print("��ȭ��ȣ : ");
				phone = sc.next();
				boolean result = false;
				for(int i=0; i<count; i++) {
					if(array[i].phone.equals(phone)) {
						result = true;
						System.out.println("�̸� : " + array[i].name);
						System.out.println("�� ��ȣ : " + array[i].carNum);
						System.out.println("��ȭ��ȣ : " + array[i].phone);
						System.out.println("��ġ : " + array[i].place);
					}
				}
				if(result == false) System.out.println("��ġ�ϴ� ������ �����ϴ�");
				break;
			case 3:
				for(int i=0; i<count; i++) {
					System.out.println("===============");
					System.out.println("�̸� : " + array[i].name);
					System.out.println("�� ��ȣ : " + array[i].carNum);
					System.out.println("��ȭ��ȣ : " + array[i].phone);
					System.out.println("��ġ : " + array[i].place);
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
