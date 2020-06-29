import java.util.Scanner;

public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int year;
		String str = null;
		
		System.out.print("ÅÂ¾î³­ ÇØ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
		year = input.nextInt();
		
		switch (year % 12) {
		case 0:
			str = "¿ø¼şÀÌ";
			break;
		case 1:
			str = "´ß";
			break;
		case 2:
			str = "°³";
			break;
		case 3:
			str = "µÅÁö";
			break;
		case 4:
			str = "Áã";
			break;
		case 5:
			str = "¼Ò";
			break;
		case 6:
			str = "È£¶ûÀÌ";
			break;
		case 7:
			str = "Åä³¢";
			break;
		case 8:
			str = "¿ë";
			break;
		case 9:
			str = "¹ì";
			break;
		case 10:
			str = "¸»";
			break;
		case 11:
			str = "¾ç";
			break;
		}

		System.out.println(year + "³â»ıÀº " + str + "¶ì ÀÔ´Ï´Ù.");


	}

}
