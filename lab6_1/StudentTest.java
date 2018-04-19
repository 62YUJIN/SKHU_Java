/*
 * 과제코드 : lab6_1
 * 작성자 : 김유진
 * 작성일 : 2018.4.12
 * 내용 : getter & setter 와 관련한 클래스를 사용할 StudentTest 클래스
 */
package lab6_1;

public class StudentTest {

	public static void main(String[] args) { // main 메소드
		Student std = new Student(); // 학생 객체를 생성
		std.setStdn(201732008); // 학생 학번을 적절히 지정
		System.out.println("학번 :" + std.getStdn()); // 학생 객체의 학번을 조회하여 출력
	}

}
