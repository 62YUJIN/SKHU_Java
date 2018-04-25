/*
 * 과제 코드 : lab6_6
 * 작성자 : 김유진
 * 작성일 : 2018.04.24
 * 내용 : 이름, 도시, 국가 정보를 갖는 학생을 표현하기 위해 Student 클래스를 사용하는 드라이버 클래스 
 */
package lab6_6;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("lab6_6: 김유진"); // 과제 정보 출력

		Student s1 = new Student("Park", "Tokyo", "Japan"); // s1 학생 객체 생성
		Student s2 = new Student("Kim", "Seoul", "Korea"); // s2 학생 객체 생성

		System.out.println(s1); // s1 학생 정보 출력
		System.out.println(s2); // s2 학생 정보 출력

		s1.move(s2.getCity(), s2.getCountry()); // s1을 s2가 사는 도시, 국가로 이사

		System.out.println("이사 후");
		System.out.println(s1); // 이사 후 s1 학생 정보 출력
		System.out.println(s2); // 이사 후 s2 학생 정보 출력
	}
}
