/*
 * 과제 코드 : hw7_3
 * 작성자 : 김유진
 * 작성일 : 2018-05-23
 * 내용 : 추상 클래스
 */
package hw7_3;

public abstract class Member {
	private int age; // 나이 필드
	
	public Member(int age) { // 나이를 매개변수로 받아 초기화하는 생성자 
		this.age = age; // 매개변수로 받은 나이를 나이 필드에 저장
	}
	
	public int getAge() { // 나이 getter 
		return age; // 나이 반환
	}
	
	public abstract int getPayment(); // getPayment 추상메소드 
}
