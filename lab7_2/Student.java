/*
 * 과제코드 : lab7_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-10
 * 내용 : 추상 클래스 연습
 */
package lab7_2;

public abstract class Student {
	private int id; // 학번에 대한 정수형 필드
	private double score; // 학점에 대한 실수형 필드
	
	public Student(int id, double score) { // 학번과 학점을 매개변수로 받아 초기화하는 생성자
		this.id = id; // 매개변수로 받은 학번 값을 학번 필드에 저장
		this.score = score; // 매개변수로 받은 학점 값을 학점 필드에 저장 
	}
	
	public int getId() { // 학번 getter
		return id; // 학번 반환 
	}
	
	public double getScore() { // 학점 getter 
		return score; // 학점 반환 
	}
	
	public void setScore(double score) { // 학점 setter 
		this.score = score; // 매개변수로 받은 학점을 학점 필드에 저장
	}
	
	public abstract boolean warning(); // 학사경고를 위한 추상 메소드 
}