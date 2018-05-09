/*
 * 과제코드 : mid1_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-08
 * 내용 : 사원 클래스 
 */
package mid1_2;

public class Employee {
	private String name; // 이름을 저장할 문자열 필드 
	private int hourlyRate; // 시급을 저장할 정수형 필드 
	private int hours; // 근무시간을 저장할 정수형 필드

	public Employee(String name, int hourlyRate, int hours) { // 이름, 시급, 근무시간을 매개변수로 받아 초기화하는 메소드 정의 
		this.name = name; // 매개변수의 값을 name 필드에 저장
		this.hourlyRate = hourlyRate; // 매개변수의 값을 hourlyRate 필드에 저장
		this.hours = hours; // 매개변수의 값을 hours 필드에 저장
	}

	public Employee(String name) { // 이름을 매개변수로 받아 초기화 하는 생성자  
		this(name, 9000, 10); // 이름, 시급, 근무시간으로 초기화
	}

	public String getName() { // 이름을 반환하는 getter 
		return name; // 이름 반환
	}

	public int getSalary() { // 봉급을 반환하는 getter
		return hourlyRate * hours; // 시급 * 근무시간으로 봉급을 계산하고 값 반환 
	}
}
