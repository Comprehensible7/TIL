
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2; i<=9; i++){
			
			System.out.print("["+i+"단]\t"); 
		}
		System.out.println();
		
		// 여기서 i는 구구단에서 1~9까지 곱해야 하는 숫자를 의미
		for(int i=1; i<=9; i++){
			
			// 여기서 j는 구구단에서 단에 해당하는 숫자를 의미
			for(int j=2; j<=9; j++){
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
				
			}
			System.out.println();
		}
	}
}
