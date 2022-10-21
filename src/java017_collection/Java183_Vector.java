package java017_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * [프로그램 출력결과]
 * kim	56	78	12	146
 * hong	46	100	97	243
 * park	96	56	88	240
 */

import java.util.Vector;

public class Java183_Vector {

	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);

	}

	private static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한 후 리턴하는 프로그램 구현
		Vector<Sawon> vt = new Vector<Sawon>();
		try (Scanner sc = new Scanner(new File(fileName))) {
			while (sc.hasNextLine()) { // kim:56/78/12
				String[] data = sc.nextLine().split("[:/]"); // 구분자로 배열 나누기
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
						Integer.parseInt(data[3])); // 배열값을 사원에 넣어야하는데, 값이 String이므로 숫자부분은 .parseInt 메소드로 int값으로 뽑아오기
				vt.add(sn); // 뽑아온 배열 객체에 넣기
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}
		return vt; // 최종 리턴은 백터에
	}

	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현
		for (Sawon sn : vt) {
			System.out.println(sn.toString());
		}

	}

}
