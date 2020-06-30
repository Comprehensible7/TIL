
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 원본
		int[] base = { 11, 12, 13, 14, 25, 30, 53, 65, 68, 77 };
		// 복사자료
		// 아래와 같이 입력 시 base값 변경 시 copy값도 변경되므로 공유처럼 사용하게 된다
		// int[] copy = base;
		
		// length를 그대로 가져와야 값에대한 문제가 안생김
		int[] copy = new int[base.length];

		// 값을 대입하기 위한 내용
		for(int i=0; i<base.length; i++) {
			// 베이스에 있는 값을 카피로 보냄
			// 순서가 뒤바뀔 경우 0이 들어간다
			copy[i] = base[i];
		}
		
		System.out.print("원본자료 : ");
		// 원본에 대한 출력값
		// i값을 반복실행
		for (int i = 0; i < base.length; i++) {
			// i를 base의 length만큼 증가시킨 값을 출력한다
			System.out.print(base[i] + " ");

		}
		// 줄바꿈
		System.out.println();

		System.out.print("복사본 : ");
		// 복사자료 출력값
		for (int i = 0; i < copy.length; i++) {
			// i를 copy의 length만큼 증가시킨 값을 출력한다
			System.out.print(copy[i] + " ");
		}

	}

}
