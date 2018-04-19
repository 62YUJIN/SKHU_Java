/*
 * 과제코드 : lab6_1
 * 작성자 : 김유진
 * 작성일 : 2018.4.12
 * 내용 : getter & setter 와 관련한 클래스 연습
 */
package lab6_1;

public class Student {
	private int stdn; // private 속성의 정수형 변수 stdn 선언

	public int getStdn() {
		return stdn; // 학번의 값이 저장되어 있는 stdn 변수를 반환
	}

	public void setStdn(int stdn) { // 학번을 지정해주는 메소드 정의
		this.stdn = stdn; // stdn이라는 private 변수에 매개변수 값을 입력
	}

}
