
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2; i<=9; i++){
			
			System.out.print("["+i+"��]\t"); 
		}
		System.out.println();
		
		// ���⼭ i�� �����ܿ��� 1~9���� ���ؾ� �ϴ� ���ڸ� �ǹ�
		for(int i=1; i<=9; i++){
			
			// ���⼭ j�� �����ܿ��� �ܿ� �ش��ϴ� ���ڸ� �ǹ�
			for(int j=2; j<=9; j++){
				System.out.print(j + "*" + i + "=" + (j * i) + "\t");
				
			}
			System.out.println();
		}
	}
}
