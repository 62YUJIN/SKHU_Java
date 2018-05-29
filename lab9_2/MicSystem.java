/*
 * 과제코드 : lab9_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-29
 * 내용 : 패키지
 */
package mic;

//MicSystem 클래스
public class MicSystem {
	// Singer를 매개변수로 받아 마이크 테스트 하는 메소드
	public void micTest(Singer singer) {
		System.out.println("마이크 테스트. 노래 시작합니다.");
		singer.sing();
	}
}