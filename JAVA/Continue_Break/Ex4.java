
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
	         
	         for (int j = 1; j <= 9; j++) {
	            if(i%2==0 && j>5) {
	                break;
	            }
	                else if(i%2==1 && j<6) {
	                   continue;
	                }
	            System.out.println(i+"*"+j+"="+(i*j));
	         }
	         
	         System.out.printf("\n");   
	         }
	}
}