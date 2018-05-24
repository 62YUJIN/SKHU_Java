/*
 * 과제 코드 : hw9_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-24
 * 내용 : 인터페이스 연습
 */
package hw9_1;

public class Dog implements Speakable{
	private int age; // 나이 필드

	@Override // speak 재정의
	public void speak() {
		for(int i = 0; i < age; i++) { // 나이만큼 반복문 실행
			System.out.print("멍"); // 개행없이 결과 출력
		}
	}

	public Dog(int age) { // 매개변수로 나이를 받아 초기화하는 생성자
		this.age = age; // 매개변수로 받은 나이를 나이 필드에 저장
	}

	public int getAge() { // 나이 getter 
		return age; // 나이 반환
	}

	public void setAge(int age) { // 나이 setter 
		this.age = age; // 매개변수로 받은 나이를 나이 필드에 저장
	}
}
