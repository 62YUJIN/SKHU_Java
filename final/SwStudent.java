/*
 * 과제 코드 : final
 * 작성자 : 김유진
 * 작성일 : 2018-06-21
 * 내용 : 소프학생 클래스
 */
public class SwStudent extends Student {
	
	private int java; // private 정수형 필드 java 선언
	
	public SwStudent(int m, int j) { // 수학점수와 자바점수를 매개변수로 받아 초기화하는 생성자 정의
		super(m); // Student 부모 클래스의 수학점수를 초기화
		this.java = j; // java 필드를 매개변수 받은 값으로 초기화
	}

	public int getJava() { // java getter
		return java; // 자바점수 반환
	}

	public void setJava(int java) { // java setter 
		this.java = java; // java 필드를 매개변수 받은 값으로 초기화
	}

	@Override // 메소드 재정의 
	public String toString() { // 문자열로 반환하는 메소드
		return "math=" + super.getMath() + " " +  "java=" + java + "--> "; // 결과값 반환
	}
	
	@Override // 메소드 재정의 
	public boolean inPass() { // 참과 거짓으로 나뉘는 boolean형 메소드
		if(super.getMath() >= 60 && java >= 60) // 만약 수학점수와 자바점수가 60점 이상이면
			return true; // 참을 반환
		else // 그 외 아니라면
			return false; // 거짓을 반환
	}
}
