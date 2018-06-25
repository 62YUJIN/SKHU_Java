/*
 * 과제 코드 : final
 * 작성자 : 김유진
 * 작성일 : 2018-06-21
 * 내용 : 학생 클래스
 */
public class Student {
	private int math; // private 정수형 필드 math 선언

	public Student(int m) { // 수학점수를 매개변수로 받아 초기화하는 생성자 정의
		this.math = m; // math 필드를 매개변수로 받은 값으로 초기화
	}

	public int getMath() { // 수학점수 getter 
		return math; // 수학점수 값 반환 
	}

	public void setMath(int math) { // 수학점수 setter
		this.math = math; // math 필드를 매개변수로 받은 값으로 초기화
	}

	@Override // 메소드 재정의 
	public String toString() { // 문자열로 값을 반환하는 메소드 정의
		return "math=" + math + "--> "; // 수학점수 값 문자열로 반환
	}
	
	public boolean inPass() { // 참과 거짓을 나타내는 boolean형 메소드
		if(math >= 60) // 만약 수학점수가 60점 이상이라면
			return true; // 참을 반환
		else // 그 외 아니라면
			return false; // 거짓을 반환
	}
	
}
