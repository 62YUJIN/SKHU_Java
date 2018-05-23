/*
 * 과제 코드 : hw7_3
 * 작성자 : 김유진
 * 작성일 : 2018-05-23
 * 내용 : 추상 클래스
 */
package hw7_3;

public class HourlyMember extends Member {
	private int useHour; // 사용시간에 대한 필드
	private final int PAY = 100; // 회비 필드 선언과 동시에 100으로 상수화
	
	public HourlyMember(int age, int useHour) { // 나이와 사용시간을 매개변수로 받아 초기화하는 생성자
		super(age); // Member의 나이로 저장 
		this.useHour = useHour; // 매개변수로 받은 사용시간을 사용시간 필드에 저장
	}
	
	public int getUseHour() { // 사용시간 getter 
		return useHour; // 사용시간 반환 
	}
	
	@Override // getPayment 재정의 
	public int getPayment() { 
		return PAY * useHour; // 시간제회원의 회비를 반환
	}
}
