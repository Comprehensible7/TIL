import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바가 미리 만들어둔 클래스 Scanner
		
		 // sc는 식별자, 스캐너를 지정하는 이름을 마음대로 지정 가능 
		 Scanner sc = new Scanner(System.in); // import해온 Scanner를 사용할 수 있는 형태로 만든 것
		 
		 //nextInt는 method 
		 int num = sc.nextInt(); // 사용할 수 있는 형태, 즉 sc를 사용해서 정수형을 입력받는 것
		 int num2 = sc.nextInt();
		 
		 int num3 = num + num2;
		 
		 System.out.println(num3);
		  
		 System.out.println(num + num2); 
		 System.out.println(num - num2);
		 System.out.println(num * num2); 
		 System.out.println(num / num2);
		 System.out.println(num % num2);
		 
		//					 4 3 4	1  2
		System.out.println(10+2*3-(5/2)%3);
		//					10  6 -	2  2 = 6-2+10
	
	}


}
