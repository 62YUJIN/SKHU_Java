/*
 * 과제 코드 : lab15_2
 * 작성자 : 김유진
 * 작성일 : 2018-06-12
 * 내용 : Map, HashMap, Wrapper Class 연습
 */
package lab15_2;

//소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다.
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		System.out.println("lab15_2 : 김유진"); // 과제 정보 출력
		Map<String, Integer> st = new HashMap<String, Integer>();

		st.put("kim", new Integer(90)); // 문자열과 정수를 나란히 저장하되 오토박싱 사용
		st.put("park", new Integer(80)); // 문자열과 정수를 나란히 저장하되 오토박싱 사용
		st.put("lee", new Integer(100)); // 문자열과 정수를 나란히 저장하되 오토박싱 사용

		Scanner sc = new Scanner(System.in); // 사용자 입력
		do {
			System.out.print("이름 입력: ");
			String key = sc.next();
			if( key.equals("quit") ) break;
			System.out.println("성젹 = " + st.get(key));
		} while(true);

		System.out.println(st); // 저장된 전체 값 출력
	}
}
