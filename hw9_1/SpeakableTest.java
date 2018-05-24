/*
 * 과제 코드 : hw9_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-24
 * 내용 : 인터페이스 연습
 */
package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		System.out.println("hw9_1 : 김유진"); // 과제 정보 출력
		Speakable[] s = new Speakable[4]; // 크기가 4인 Speakable형 배열 생성

		// 배열에 객체를 저장
		s[0] = new Person("강감찬"); // Person 객체 생성
		s[1] = new Person("홍길동"); // Person 객체 생성
		s[2] = new Dog(2); // Dog 객체 생성
		s[3] = new Dog(5); // Dog 객체 생성
		
		for(int i = 0; i < s.length; i++) { // 반복문을 배열의 길이 만큼 실행
			s[i].speak(); // speak 호출
			System.out.println(" "); // 출력되는 결과의 가독성을 높이기 위한 개행
		}
	}
}
