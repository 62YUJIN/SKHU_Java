/*
 * 과제 코드 : lab7_4
 * 작성자 : 김유진
 * 작성일 : 2018-05-15
 * 내용 : ''
 */
package lab7_4;

public class Circle {
	private double radius; // 반지름에 대한 실수형 필드
	
	public Circle(double radius) { // 매개변수로 받은 반지름 값을 반지름 필드 값에 저장 
		this.radius = radius;
	}

	@Override
	public int hashCode() { // 해시코드 자동 생성
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) { // equals 자동 생성
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	@Override
	public String toString() { // toString() 자동 생성 
		return "Circle [radius=" + radius + "]";
	}

	public double getRadius() { // 반지름 getter 자동 생성
		return radius;
	}

	public void setRadius(double radius) { // 반지름 setter 자동 생성
		this.radius = radius;
	}
	
//	@Override
//	public String toString() {
//		return "반지름 :" + radius;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		Circle other = (Circle) obj;
//		return radius == other.radius;
//	}
}
