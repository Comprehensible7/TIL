package chap9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성불가, 선언만 해줄 수 있음
		// 입력
		FileInputStream fis = null;
		// 출력
		FileOutputStream fos = null;

		try {
			// 파일의 경로는 프로젝트 바로 아래에 속해야 한다
			fis = new FileInputStream("song.txt");
			fos = new FileOutputStream("copySong.txt");
			// read를 해올때는 int형을 사용한다
			// 입력스트림으로부터 1바이트의 데이터를 읽고 코드 값을 리턴한다.
			// data의 값이 -1인 경우는 파일에서 데이터를 읽었을때 데이터가 없는 경우
			// eof(end of file)
			int data;

			while (true) {
				data = fis.read();
				if (data == -1) {
					break;
				}
				
				// 파일 출력(복사)를 진행 (data)
				fos.write(data);
				
				// char형태의 data를 출력
				System.out.print((char) data);
			}

			// 파일을 찾지 못하였을때 오류내용을 출력해준다
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		// 예외가 뭐던간에 무조건 출력하는 finally
		} finally {

			try {
				// fileInput이 null이 아니면 close한다.
				if (fis != null)
					fis.close();
				// fileOut이 null이 아니면 close한다.
				if (fos != null)
					fos.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// 복사 성공 시 메세지를 출력한다.
		System.out.println("\n\nFile Copy Complete!");

	}

}
