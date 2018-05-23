/*
 * 과제 코드 : hw7_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-21
 * 내용 : Point 클래스와 Circle 클래스를 사용하는 드라이버 클래스
 */
package hw7_2;

public class CirclePointTest {

	public static void main(String[] args) {
		System.out.println("hw7_2 : 김유진"); // 과제 정보 출력
		Circle c1 = new Circle(1.5); // c1 객체 생성 
		Circle c2 = new Circle(1.5, new Point(10, 20)); // c2 객체 생성
		Circle c3 = new Circle(3.5, new Point(10, 20)); // c3 객체 생성

		System.out.println(c2.sameCenter(c1));    // false 출력 
		System.out.println(c2.sameCenter(c3));    // true 출력

		printCircle(c2); // c2의 반지름, 중심의 x, y 좌표를 출력하는 메소드 printCircle 출력
	}

	// 매개변수로 받은 원 c의 반지름, 중심의 x, y좌표를 출력하는 메소드
	private static void printCircle(Circle c) {
		System.out.println(c.getRadius()); // 매개변수로 받은 c의 반지름 출력
		System.out.println(c.getCenter().getX()); // 매개변수로 받은 c의 중심의 x 좌표 출력 
		System.out.println(c.getCenter().getY()); // 매개변수로 받은 c의 중심의 y 좌표 출력
	}
}
