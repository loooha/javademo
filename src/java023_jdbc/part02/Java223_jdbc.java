package java023_jdbc.part02;

import java.util.List;
import java.util.Scanner;

/*
 * MVC 패턴
 * Model : 데이터 관리 (DAO는 model에 속함)
 * View : 결과 화면에 출력
 * Controller : 클라이언트 요청과 응답처리, Model과 View연결
 */

/*
 *  1. ClassNotFoundException 
 *  해결) JRE System Library에서 ojdbc6.jar파일 확인
 *      Class.forName(): 경로확인
 *      
 * 2. java.sql.SQLException: 
 *     IO예외 상황:  The Network Adapter...
 *                 Listener refused.....  
 *                 
 *     해결) 제어판->관리도구->서비스->OracleServiceXE,
 *            OracleXETNSListener을 다시 시작한다.
 * 
 * java.sql.PreparedStatement
 * 1 반복되는 쿼리문의 수행에 사용한다.
 * 2 미리 정의된 SQL문을 수행하기 때문에 Statement에 비해 속도가 빠르다.
 * 3 위치표시자(placeholder)(?)를 사용하여 쿼리문을 간략하게 작성한다.
 * 
 * 싱글톤 패턴
 *  : 하나의 객체만을 생성해서 사용할 수 있도록 설계한 구조이다.
 *  1 생성자의 접근제어자는 private
 *  2 객체자신을 생성을 한다.
 *  3 생성된 객체를 넘겨줄 수 있는 메소드를 정의한다.
 */

public class Java223_jdbc {

	public static void main(String[] args) {
		DepartmentsController dController = new DepartmentsController();

		Scanner sc = new Scanner(System.in);
		System.out.printf("1 전체, 2 검색어");

		int input = Integer.parseInt(sc.nextLine());
		if (input == 1) {
			List<DepartmentsDTO> aList = dController.departmentsAllProcess();
			display(aList);

		} else if (input == 2)

		{
			System.out.printf("부서 입력: ");
			String line = sc.nextLine();
			List<DepartmentsDTO> aList = dController.departmentsSearchProcess(line);
			display(aList);
		}

	}// end main()

	private static void display(List<DepartmentsDTO> aList) {
		for (DepartmentsDTO dto : aList) {
			System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(),
					dto.getLocation_id());
		}
	}// end display()

}// end class
