/*
 * 과제코드 : lab7_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-10
 * 내용 : 대학원생 클래스 
 */
package lab7_2;

public class GraduateStudent extends Student{ // 대학원생에 대한 학생 클래스의 상속 클래스
	public GraduateStudent(int id, double score) { // 학번과 학점을 매개변수로 받아 초기화하는 생성자
		super(id, score); // Student 클래스의 학번과 학점 필드로 저장 
	}
	@Override // 재정의 
	public boolean warning() { // 불리언형 학사경고 추상메소드 
		if( getScore() >= 1.5 && getScore() < 3.0 ) // 만약 학점이 1.5 이상이고, 3.0 미만일 경우 
			return true; // 참값 반환 
		else // 그 외 
			return false; // 거짓값 반환
	}
}