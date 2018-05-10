/*
 * 과제코드 : lab7_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-10
 * 내용 : Student 클래스의 드라이버 클래스
 */
package lab7_2;

public class StudentTest {

	public static void main(String[] args) {
		UnderGraduateStudent ugs = new UnderGraduateStudent(11, 1.5); // 학부생 객체 생성
		GraduateStudent gs = new GraduateStudent(222, 3.0); // 대학원생 객체 생성 
		System.out.println("lab7_2 : 김유진"); // 과제 정보 출력 
		System.out.println(ugs.getId() + " " + ugs.getScore() + " " + ugs.warning()); // 학부생의 학번, 학점, 학사경고 여부 출력 
		System.out.println(gs.getId() + " " + gs.getScore() + " " + gs.warning()); // 대학원생의 학번, 학점, 학사경고 여부 출력 
	}

}
