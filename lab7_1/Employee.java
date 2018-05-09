/*
 * 과제코드 : lab7_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-08
 * 내용 : protected 연습 
 */
package lab7_1;

public class Employee {
	private int salary; // 봉급에 대한 정수형 필드 

	public int getSalary() { // 봉급 getter 
		return salary; // 봉급 반환 
	}
	public void setSalary(int salary) { // 봉급 setter
		this.salary = salary; // 정수형 필드에 매개변수로 받은 봉급 값 저장 
	}
	public int getTax() { // 세금 getter 
		return salary / 10; // 세금액 (봉급의 10%)을 리턴
	}
}
