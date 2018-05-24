/*
 * 과제 코드 : hw9_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-24
 * 내용 : 인터페이스 연습
 */
package hw9_1;

public class Person implements Speakable{
	private String name; // 이름 필드
	
	@Override // speak 재정의
	public void speak() {
		System.out.println("안녕하세요"); // 결과 출력
		System.out.println( name + "" + "입니다."); // 이름과 함께 결과 출력
	}
	
	public Person(String name) { // 이름을 매개변수로 받아 초기화하는 생성자
		this.name = name; // 매개변수로 받은 이름을 이름 필드에 저장
	}
	
	public String getName() { // 이름 getter
		return name; // 이름 반환
	}

	public void setName(String name) { // 이름 setter
		this.name = name; // 매개변수로 받은 이름을 이름 필드에 저장
	}
}
