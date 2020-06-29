
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {5, 3, 6, 7, 2, 4, 8};
		
		// 최대값
		int max = num[0];
		// 최소값
		int min = num[0];

		// 위에서 이미 0번째를 넣어두었기때문에 기준은 1번째부터 입력해주어도 문제없음
		for(int i = 1; i<num.length; i++) {
			if(max<num[i]) {
				// max의 값보다 num[i]이 크면 max = num[i]
				max = num[i];
			}else if(min>num[i]) {
				// min의 값보다 num[i]이 작으면 min = num[i]
				min = num[i];
			}
			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		}

	}


