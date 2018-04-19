/*
 * 과제코드 : lab6_2
 * 작성자 : 김유진
 * 작성일 : 2018.04.19
 * 내용 : 원 클래스
 */
package lab6_2;

public class Circle {
	private double radius; // 반지름에 대한 실수형 변수 radius 선언
	
	public Circle() { // 매개변수 없이 반지름 1.0으로 초기화하는 메소드 Circle 정의 
		radius = 1.0; // radius 1.0으로 초기화
	}
	
	public Circle(double radius) { // 반지름을 매개변수로 받아 초기화하는 메소드 Circle 정의 
		this.radius = radius; // 필드 radius에 매개변수 radius 값을 삽입 
	}
	
	public double getRadius() { // 반지름 getter 
		return radius; // radius 값을 반환 
	}
	
	public double setRadius(double radius) { // 반지름 setter 
		this.radius = radius; // 필드 radius에 매개변수 radius 값을 삽입 
		return radius; // radius 값을 반환 
	}
	
	public double Area() { // 면적을 계산하는 메소드 area 정의 
		return radius * radius * 3.14; // 면적 계산 
	}
}
