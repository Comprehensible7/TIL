public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 사용빈도수가 높은기능들

		// CharAt, equals, IndexOf,lastIndexOf
		// length, split, substring, toLowerCase
		// toUpperCase, trim

		String str3 = "AAA";
		// 두개의 문자열이 완벽하게 동일하면 0이라는 값이 출력된다
		int compareNum = str3.compareTo("AAA");
		System.out.println(compareNum);
		System.out.println();

		String str4 = "Hello";
		// concat은 문자열을 붙여줌
		String concatStr = str4.concat("Java");
		String concatStr2 = str4 + "Java";
		System.out.println(concatStr);
		System.out.println(concatStr2);
		System.out.println();

		String str5 = "Hello Java";
		// 문자열에 해당 문자가 있는지를 체크해줌
		// 있으면 True, 없으면 False를 출력해준다
		boolean containsCheck = str5.contains("J");
		boolean containsCheck2 = str5.contains("B");
		System.out.println(containsCheck);
		System.out.println(containsCheck2);
		System.out.println();

		String str6 = "Java";
		// equals는 문자열 비교, 대소문자가 동일한지 비교를해보고 다르면 false출력
		// 완벽하게 일치해야만 True를 출력
		boolean equalsCheck = str6.equals("java");
		boolean equalsCheck2 = str6.equals("Java");
		System.out.println(equalsCheck);
		System.out.println(equalsCheck2);
		System.out.println();

		String str7 = "Hello World!";
		// 입력한 값이 몇번째에 있는지를 나타낸다
		// 인덱스값은 0부터 시작하기때문에
		int indexOfNum = str7.indexOf("W");
		// 내용이 중복되는경우는 앞에서부터 찾아서 값을 반환한다
		int indexOfNum2 = str7.indexOf("l");
		System.out.println(indexOfNum);
		System.out.println(indexOfNum2);
		System.out.println();

		String str8 = "Hello World!";
		// 입력한값을 뒤에서부터 검색하여 체크한다
		// 인덱스값의 위치는 변함없이 0부터 체크한다. 검색만 뒤에서부터 하는것임
		int lastIndexOfNum = str8.lastIndexOf("W");
		int lastIndexOfNum2 = str8.lastIndexOf("o");
		System.out.println(lastIndexOfNum);
		System.out.println(lastIndexOfNum2);
		System.out.println();

		String str9 = "Hello World!";
		// 시작하는 인덱스값부터 마지막 지정해준 인덱스값까지 출력한다
		// 예시로 아래의 2, 8의경우는 2의 위치는 포함하지만 8의 위치는 ~까지이므로 포함하지 않는다
		// 실제 출력은 2부터 7까지 나온다
		String subStr = str9.substring(2, 8);
		// 인덱스를 하나만 설정해줄경우 뒤의것을 모두 가져온다
		// 아래의 예시로 인덱스값을 2를 작성한다면 2부터 뒤의 값을 모두 가져온다
		String subStr2 = str9.substring(2);
		System.out.println(subStr);
		System.out.println(subStr2);
		System.out.println();

		// 사용자가 파일명을 입력한다고 했을때
		// 예를들어 그림파일이라고 한다면 star.jpg, aaaa.jpeg, bbbb.png
		// 동영상 ccc.avi, ddd.mkv
		// 사용자가 입력한 파일의 확장자를 구분할수 있게 된다
		String str10 = "st.a.r.123.jpg";
		String ext = str10.substring(11);
		// 확장자를 찾을때는 맨뒤의 .을 검색하면 된다
		int extNum = str10.lastIndexOf(".");
		String fileName = str10.substring(0, extNum);

		// +1을 해준 이유는 .까지 검색하고난뒤, 그다음 인덱스값부터 출력하기위함이다
		System.out.println(extNum + 1);
		System.out.println("파일명은 : " + fileName);
		System.out.println("확장자는 : " + ext);
//		System.out.println(ext);
		System.out.println();

		// 1,3 남성 2,4 여성 5,6 외국인
		String str2 = "900514-3xxxxxx";
		char c4 = str2.charAt(7);

		// char를 사용하기위해서는 ''를 사용
		if (c4 == '1' || c4 == '3') {
			System.out.println("내국인 남성");
		} else if (c4 == '2' || c4 == '4') {
			System.out.println("내국인 여성");
		} else if (c4 == 5 || c4 == 6) {
			System.out.println("외국인");
		}

//		String str = "Hello World";

		// 0부터 시작하므로 Hello상의 4번째 l이 출력
//		char c = str.charAt(3);
//		char c1 = str.charAt(4);
//		char c2 = str.charAt(8);
//		char c3 = str.charAt(10);

		// 스트링의 경우 범위를 초과할경우 StringIndexOitOfBoundsException이 출력됨
//		System.out.print(c);
//		System.out.print(c1);
//		System.out.print(c2);
//		System.out.print(c3);
//		System.out.println();

		System.out.println();
		String s = new String("abcdefg");
		// SubString값이 3이면 d e f g 가 나오는데 indexOf를 e를 입력하였으니
		// d부터 인덱스값이 0이라 보고 시작하기때문에 값이 1이 나온다
		// indexOf는 입력한 값이 몇번째에있는지 알려준다.
		System.out.println(s.substring(3).indexOf('e'));

		String str11 = "Hello World!";
		// 문자열의 총 길이를 나타내준다 (메서드,기능)
		int lengthStr = str11.length();
		System.out.println("문자열의 길이는 : " + lengthStr);
		System.out.println();

		int[] arr = new int[10];
		// 얘는 배열의 길이임 (속성)
		int lengthArr = arr.length;

		String str12 = "Hello World!";
		// oldChar를 newChar로 변환해준다
		// 중복되는 내용이 있으면 그것들을 모두 변환해준다
		String replaceStr = str12.replace('d', 'D');
		System.out.println("문자열 치환하기 : " + replaceStr);
		System.out.println();

		// 전체를 변경가능하다
		String replaceStrAll = str12.replaceAll(str12, "Wunderbar");
		System.out.println("전체변환 : " + replaceStrAll);
		System.out.println();

		String str13 = "aa1bb1cc1dd";
		// 문자열을 기준으로 나눈다
		// 입력한 문자열을 기준으로 나뉜다
		String[] splitArr = str13.split("1");

		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		System.out.println();

		String str14 = "오늘은 금요일 치킨을 시켜먹자.";
		// 공백찾기, " " 가운데 내용이 비어있는것도 공백이다
		String[] splitArr2 = str14.split(" ");

		for (int i = 0; i < splitArr2.length; i++) {
			System.out.println(splitArr2[i]);
		}
		System.out.println();

		String str15 = "Hello World!";
		String lowerStr = str15.toLowerCase();
		String upperStr = str15.toUpperCase();

		System.out.println("소문자 변환 : " + lowerStr);
		System.out.println("대문자 변환 : " + upperStr);
		System.out.println();

		// 어떤 특수한 상황에서 대/소문자를 구별하지 않고 문자를 판단해야 할때 사용한다
		// 특해 검색할때 사용이 자주됩니다.
		// Java String : 검색어 java string, JAVA STRING, JaVa StrINg 등

		String str16 = "         Hello World!           ";
		// 문자열 양 끝의 공백제거
		String trimStr = str16.trim();
		System.out.println("공백 제거 : " + trimStr);

	}

}
