package java016_stream;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Java172_stream {

	public static void main(String[] args) throws IOException {
		// File file = new File("src/java016_stream/temp");
		// File file = new File("src/java016_stream/a");
		File file = new File("src/java016_stream/sample.txt");

		// 종료시 삭제하도록 설정
		file.deleteOnExit();

		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close(); // 중요! 종료를 해줘야 위에서 입력한 메소드대로 파일이 삭제 됨

		// file.createTempFile("source", "test");

//		if (file.isDirectory()) {
//			// 폴더 삭제
//			// file.delete();
//			// file.deleteOnExit();
//			System.out.println("폴더 삭제");
//		} else {
//			System.out.println("폴더 없음");
//		}

	}

}
