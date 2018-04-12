/*
 * 과제코드 : lab5_4
 * 작성자 : 김유진
 * 내용 : 점을 표현하는 Point 클래스 객체를 생성하고 이용하는 프로그램
 */
package lab5_4;

public class PointTest {

	public static void main(String[] args) {
		System.out.println("lab5_4: 김유진"); // 과제 정보 출력 
		Point p1 = new Point(); // 좌표 하나 생성 
		Point p2 = new Point(); // 좌표 하나 생성 
		
		p1.move(4.5); // p1 좌표를 4.5 만큼 이동 
		p2.move(-1.0); // p2 좌표를 -1.0 만큼 이동 
		p1.move(1.0); // p1 좌표를 1.0만큼 다시 이동 
		p1.move(); // 매개변수 없이 p1을 1.0 만큼 다시 이동 
		System.out.println(p1.toString()); // p1 좌표 오버라이드를 이용하여 출력 
		System.out.println(p2.toString()); // p2 좌표 오버라이드를 이용하여 출력 
		double distance = p1.distance(p2); // p1과 p2 사이의 거리를 계산하는 메소드 호출 
		System.out.println(distance); // 거리 출력 
	}

}
