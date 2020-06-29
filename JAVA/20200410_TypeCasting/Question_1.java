
public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short s1 = 1;
		short s2 = 2;
		
		int i1 = 3;
		int i2 = 4;
		
		// short result1 = s1 + s2; -> short로 계산하더라도 기본형이 int라서 변환필요
		short result1 = (short) (s1 + s2);
		int result2 = i1 + i2;
		// long result2 = i1 + i2; -> int보다 상위값이라서 자동형변환 진행됨
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
