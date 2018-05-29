/*
 * 과제코드 : lab9_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-29
 * 내용 : 인터페이스 & 무명 클래스 & 람다식 사용 연습
 */
package lab9_1;

// Singer 인터페이스
interface Singer {
	void sing(); // 노래함
}

// Singer를 구현한 Person 클래스
class Person implements Singer {
	public void sing() {
		System.out.println("도레미파솔라시도");
	}
}

// MicSystem 클래스
class MicSystem {
	// Singer를 매개변수로 받아 마이크 테스트 하는 메소드
	public void micTest(Singer singer) {
		System.out.println("마이크 테스트. 노래 시작합니다.");
		singer.sing();
	}
}

//Singer를 구현한 Dog 클래스
class Dog implements Singer {
	public void sing() {
		System.out.println("멍멍");
	}
}

//Singer를 구현한 Cat 클래스
class Cat implements Singer {
	public void sing() {
		System.out.println("야옹");
	}
}

//Singer를 구현한 Chicken 클래스
class Chicken implements Singer {
	public void sing() {
		System.out.println("삐약삐약");
	}
}

//Singer 인터페이스를 테스트하는 클래스
public class SingerTest {
	public static void main(String[] args) {
		System.out.println("lab9_1 : 김유진");

		// 마이크 시스템 객체를 생성
		MicSystem mic = new MicSystem();

		// Person 객체를 생성하여 마이크 테스트 매개변수로 전달
		mic.micTest(new Person());

		// Dog 객체를 생성하여 마이크 테스트 매개변수로 전달
		mic.micTest(new Dog());

		mic.micTest(new Singer() { // Cat 객체를 무명 클래스를 사용하여 호출

			@Override
			public void sing() {
				System.out.println("야옹");
			}
		});
		
		// 삐약삐약을 노래하는 메소드를 람다식으로 마이크 테스트 매개변수로 전달
		mic.micTest(() -> System.out.println("삐약삐약")); 
	}
}