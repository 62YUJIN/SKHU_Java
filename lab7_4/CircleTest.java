/*
 * 과제 코드 : lab7_4
 * 작성자 : 김유진
 * 작성일 : 2018-05-15
 * 내용 : ''
 */
package lab7_4;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab7_4 : 김유진"); // 과제 정보 출력
		Circle c1 = new Circle(1.5); // 반지름 1.5인 원 객체 c1 생성
		Circle c2 = new Circle(1.5); // 반지름 1.5인 원 객체 c2 생성 
		
		System.out.println(c1.toString()); // c1에 대해 toString() 호출하여 출력
 		System.out.println(c2.toString()); // c2에 대해 toString() 호출하여 출력
 		System.out.println(c1 == c2); // c1과 c2를 == 로 비교한 결과 출력
 		System.out.println(c1.equals(c2)); // c1과 c2를 equals()로 비교한 결과 출력
 		
	}

}
