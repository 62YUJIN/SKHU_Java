/*
 * 과제 코드 : hw7_3
 * 작성자 : 김유진
 * 작성일 : 2018-05-23
 * 내용 : 추상 클래스
 */
package hw7_3;

public class RegularMember extends Member{
	private final int PAY = 1000; // 회비 필드 선언과 동시에 1000으로 상수화
	
	public RegularMember(int age) { // 나이를 매개변수로 받아 초기화하는 생성자
		super(age); // Member의 나이로 저장
	}
	
	@Override // getPayment 재정의
	public int getPayment() {
		return PAY; // 정회원의 회비 반환
	}
}
