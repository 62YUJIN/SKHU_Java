/*
 * 작성자 : 김유진
 * 작성일 : 2017.03.20
 * 과제코드 : 과정지도 quiz2
 * 내용 : 나이와 키의 조건을 부합하여 출력되는 프로그램
 */
package quiz2; //클래스 묶음 패키지 정의
import java.util.Scanner; // 입력을 위한 스캐너 유틸리티 임포트 

public class quiz2code {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		
		System.out.println("quiz2 : 김유진\n"); //프로그램 정보 출력을 위한 출력문
		
		System.out.println("이름 입력 :"); // 이름 입력을 위한 출력문
		String name = input.nextLine(); // 문자열 name 변수에 이름을 저장
		
		System.out.println("나이 입력 :"); // 나이 입력을 위한 출력문
		int age = input.nextInt(); // 정수형 age 변수에 나이를 저장
		
		System.out.println("키 입력 :"); // 키 입력을 위한 출력문
		double cm = input.nextDouble(); // 실수형 cm 변수에 키를 저장
		
		System.out.println(name + "고객님.\n"); // ~ 고객님 결과 출력문
		System.out.println((age >= 13) ? "나이 :" + age + "세," : "나이가 적합하지 않습니다."); // 나이 : ~세 결과 출력문
		System.out.println((cm >= 130) ? "키 :" + cm + "cm이므로\n이용이 가능합니다.\n" : "키가 적합하지 않습니다."); // 키 : ~ 이므로 이용가능합니다. 결과 출력문
		
	}

}
