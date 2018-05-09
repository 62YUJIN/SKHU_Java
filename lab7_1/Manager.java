/*
 * 과제코드 : lab7_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-08
 * 내용 : protected 연습 
 */
package lab7_1;

public class Manager extends Employee{
	
	private int bonus; // 보너스에 대한 정수형 필드

	public int getBonus() { // 보너스 getter 
		return bonus; // 보너스 반환
	}
	public void setBonus(int bonus) { // 보너스 setter 
		this.bonus = bonus; // 매개변수로 받은 보너스의 값을 보너스 필드로 저장
	}
	@Override 
	public int getTax() { // getTax 오버라이딩 
		return (bonus + getSalary()) / 10; // 세금액 재정의
	}
}
