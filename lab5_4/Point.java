/*
 * 과제코드 : lab5_4
 * 작성자 : 김유진
 * 내용 : x좌표를 갖는 1차원 점을 표현하는 Point 클래스 정의  
 */
package lab5_4;

public class Point {
	double xposition;
	double dst;
	void move(double xpos) { // void 메소드는 반환을 할 수 없음
		xposition += xpos;
	}
	
	@Override // Point의 속성을 문자열로 만들어 반환 
	public String toString() {
		return "Point = [X = " + xposition + "]";
	}
	
	void move() {
		xposition += 1;
	}
	
	double distance(Point xpos) {
		if (xposition > 0 && xpos.xposition > 0) {
			dst = xposition+xpos.xposition;
			return dst;
		}
		else {
			if(xposition+(-xpos.xposition) > 0) {
				dst = xposition+(-xpos.xposition);
				return dst;
			}
			else {
				dst = -(xposition + (-xpos.xposition));
				return dst;
			}
		}
	}
}
