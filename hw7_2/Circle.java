/*
 * 과제 코드 : hw7_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-21
 * 내용 : 원을 표현하는 클래스
 */
package hw7_2;

public class Circle {
	private double radius;  // 반지름
	private Point center;   // 중심 점

	// 반지름은 매개변수로 받아 초기화하고, 중심은
	// x, y좌표가 0, 0인 점으로 초기화하는 생성자
	public Circle(double radius) {
		this.radius = radius; // 매개변수로 받은 반지름 값을 반지름 필드에 저장 
		center = new Point(0,0); // 중심의 x, y 좌표를 0,0으로 초기화
	}

	public Circle(double radius, Point center) { // 반지름과 중심을 매개변수로 받아 초기화하는 생성자
		this.radius = radius; // 매개변수로 받은 반지름을 반지름 필드에 저장 
		this.center = center; // 매개변수로 받은 중심 점을 중심 점 필드에 저장
	}

	public double getRadius() { // 반지름 getter 
		return radius; // 반지름 반환
	}

	public Point getCenter() { // Point형 중심 점 getter
		return center; // 중심 점 반환
	}

	// 현재 원이 매개변수로 받은 원(other)과 중심 점의
	// x, y 좌표가 모두 동일한지 여부(true/false)를 리턴하는 메소드
	// 이 메소드에는 출력문 없음
	public boolean sameCenter(Circle other) {
		// 중심의 x좌표와 매개변수로 받은 원 other의 중심 x좌표가 같고,
		// 중심의 y좌표와 매개변수로 받은 원 other의 중심 y좌표가 같으면 그 값을 반환
		return center.getX() == other.center.getX() && center.getY() == other.center.getY();
	}
	
}
