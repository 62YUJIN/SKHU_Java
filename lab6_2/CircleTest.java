/*
 * 과제코드 : lab6_2
 * 작성자 : 김유진
 * 작성일 : 2018.04.19
 * 내용 : 원 클래스를 사용할 main 클래스가 포함된 테스트 클래스
 */
package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab6_2 : 김유진"); // 과제 정보 출력
		
		Circle c1 = new Circle(); // 원 생성 c1 
		Circle c2 = new Circle(2.5); // 반지름 2.5인 원 생성 c2
		
		System.out.println(c1.getRadius()); // c1 반지름을 조회하여 출력
		System.out.println(c2.getRadius()); // c2 반지름을 조회하여 출력 
		System.out.println(c1.Area()); // 면적 계산 메소드 호출 후 결과 출력
		System.out.println(c2.Area()); // 면적 계산 메소드 호출 후 결과 출력
		
		c1.setRadius(2.5); // c1의 반지름을 c2 반지름으로 지정
		System.out.println(c1.getRadius()); // c1 반지름을 조회하여 출력
		System.out.println(c2.getRadius()); // c2 반지름을 조회하여 출력
		System.out.println(c1.Area()); // 면적 계산 메소드 호출 후 결과 출력
		System.out.println(c2.Area()); // 면적 계산 메소드 호출 후 결과 출력
		
		c2.setRadius(1.5);
		System.out.println(c1.Area()); // 면적 계산 메소드 호출 후 결과 출력
		System.out.println(c2.Area()); // 면적 계산 메소드 호출 후 결과 출력
		
	}

}
