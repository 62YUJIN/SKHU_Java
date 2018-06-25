/*
 * 과제 코드 : final
 * 작성자 : 김유진
 * 작성일 : 2018-06-21
 * 내용 : 학생, 소프학생 클래스의 드라이버 클래스
 */
public class StudentTest {

	public static void main(String[] args) {
		System.out.println("final : 김유진"); // 과제 정보 출력
		
		Student[] s = new Student[4]; // Student형 배열 s 선언과 동시에 크기 4로 초기화
		
		s[0] = new Student(60); // 1번째 객체, 초기화
		s[1] = new Student(50); // 2번째 객체, 초기화
		s[2] = new SwStudent(60, 70); // 3번째 객체, 초기화
		s[3] = new SwStudent(60, 50); // 4번째 객체, 초기화
		
		for(int i = 0; i < s.length; i++) { // 배열 s의 길이만큼 반복문 실행
			System.out.println(s[i].toString() + "" + "" + s[i].inPass()); // 합격여부 결과 출력
		}
	}

}
