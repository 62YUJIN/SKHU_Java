/*
 * 과제코드 : hw9_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-29
 * 내용 : 인터페이스와 무명 클래스 연습
 */
package hw9_2;

class Student { // 학생 클래스 정의
	int age; // 학생 나이에 대한 정수형 필드
	int score; // 학생 점수에 대한 정수형 필드
}

@FunctionalInterface // 함수적 인터페이스 정의
interface Tester {
	boolean test(Student s); // 불리언형 test 메소드 정의와 동시에 학생 객체를 매개변수로 받기
}

public class TesterTester {
	public static void check(Student s, Tester t) {
		boolean result = t.test(s); // 불리언형 변수 result에 test메소드의 결과를 삽입
		System.out.println(result); // 그 결과를 출력 
	}

	public static void main(String... args) {
		System.out.println("hw9_2: 김유진"); // 과제 정보 출력

		Student kim = new Student(); // 학생 객체 생성
		kim.age = 19; // 나이는 19로 초기화
		kim.score = 80; // 점수는 80으로 초기화

		Tester PassTester = new Tester(){ // PassTester 무명 클래스 정의
			@Override
			public boolean test(Student s) {
				return s.score >= 60;
			}
		};
		
		Tester AdultTester = new Tester() { // AdultTester 무명 클래스 정의
			@Override
			public boolean test(Student s) {
				return s.age >= 20;
			}  
		};

		check(kim, PassTester); // 실행되는지 확인

		check(kim, AdultTester); // 실행되는지 확인
	}
}
