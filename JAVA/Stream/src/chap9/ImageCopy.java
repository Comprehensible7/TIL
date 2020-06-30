package chap9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		FileInputStream fis = null;
		// 출력
		FileOutputStream fos = null;

		try {
			// 파일 입력, 불러온다.
			fis = new FileInputStream("What.jpg");
			// 파일 출력, 복사한다.
			fos = new FileOutputStream("OMG.jpg");

			// 파일을 읽어올 변수
			int count;
			// byte[]를 매개변수로 사용한 read()는 읽은 데이터 크기를 변환한다.
			// 185byte 50개씩 읽으면 3번 읽고 4번째는 35개를 읽게된다.
			byte[] buffer = new byte[50]; // 추가

			while (true) {
				// 읽어올때는 int형으로 받아온다
				count = fis.read(buffer); // 추가

				// 읽어오는 값이 buffer(배열, 사이즈)보다 작으면
				if (count < buffer.length) {
					
					for (int i = 0; i < count; i++) {
					//	출력한다. buffer의 i값 만큼
						fos.write(buffer[i]);
					}
					break;
				}
				// 배열만큼 출력
				fos.write(buffer);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("File Copy Complete!");

	}

}
