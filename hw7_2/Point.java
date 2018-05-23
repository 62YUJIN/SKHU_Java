/*
 * 과제 코드 : hw7_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-21
 * 내용 : 점을 표현하는 클래스
 */
package hw7_2;

public class Point {
	private int x; // x 좌표 필드
	private int y; // y 좌표 필드

	public Point(int x, int y) { // x, y 좌표를 매개변수로 받아 초기화 하는 생성자
		this.x = x; // 매개변수로 받은 x 좌표 값을 x 좌표 필드에 저장
		this.y = y; // 매개변수로 받은 y 좌표 값을 y 좌표 필드에 저장
	}
	public int getX() { // x 좌표 getter
		return x; // x 값 반환
	}
	public int getY() { // y 좌표 getter 
		return y; // y 값 반환
	}
}
