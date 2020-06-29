
public class Ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열을 생성할때 값을 지정해서 생성하는 방법 입니다.
		int[] arr = { 11, 12, 13, 14, 25, 30, 54, 65, 68, 77 };
		// 복사배열을 만들때 크기 지정 하는곳에 원본배열 변수명.length 사용이 중요합니다.
		int[] copyArr = new int[arr.length];

		// 사실 복사라고 했지만 값을 대입하는것이죠!
		for (int i = 0; i < arr.length; i++) {
			copyArr[i] = arr[i];
		}

		System.out.print("원본 배열 : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("복사본 : ");
		for (int i = 0; i < copyArr.length; i++) {
			System.out.print(copyArr[i] + " ");
		}
		System.out.println();

	}

}
