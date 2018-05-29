/*
 * 과제코드 : hw9_3
 * 작성자 : 김유진
 * 작성일 : 2018-05-29
 * 내용 : 인터페이스와 람다식 사용
 */
package hw9_3;

class Student { // 학생이라는 클래스 정의
	int age; // 나이에 대한 필드
	int score; // 점수에 대한 필드
}

@FunctionalInterface // 함수형 인터페이스
interface Tester {
	boolean test(Student s); // boolean형 test 메소드
}

public class Main {
	public static void check(Student s, Tester t) {
		boolean result = t.test(s); // boolean형 변수 result에 t.test() 삽입
		System.out.println(result); // result 출력
	}

	public static void main(String... args) {
		System.out.println("hw9_3: 김유진"); // 과제 정보 출력

		Student kim = new Student(); // 학생 객체 생성
		kim.age = 19; // kim이라는 학생의 나이를 19로 초기화
		kim.score = 80; // kim이라는 학생의 점수를 80으로 초기화

		// 밑의 코드를 람다식으로 표현
//		class PassTester implements Tester {
//			@Override
//			public boolean test(Student s) {
//				return s.score >= 60;
//			}
//		}
//
//		class AdultTester implements Tester {
//			@Override
//			public boolean test(Student s) {
//				return s.age >= 20;
//			}   
//		}

		check(kim, (Student s) -> s.score >= 60); // 람다식으로 적절한 결과값 출력
		
		check(kim, (Student s) -> s.age >= 20); // 람다식으로 적절한 결과값 출력
		
		// 위의 코드보다 간단히 해석한 문장
//		check(kim, s -> s.score >= 60);
//		
//		check(kim, s -> s.age >= 20);
	}
}


