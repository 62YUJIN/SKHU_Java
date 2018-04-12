/*
 * 과제코드 : lab5_2
 * 작성자 : 김유진
 * 작성일 : 2018.4.10
 * 내용 : 빈복문을 이용하여 배열에 대한 객체를 생성하고, 채널을 지정하여 출력하는 TelevisionTest ,main 클래스 정의
 */
package lab5_2;

public class TelevisionTest {

	public static void main(String[] args) {

		Television [] tv = new Television[3]; // 크기가 3인 Television 클래스 객체 tv 생성

		for(int i=0; i < 3; i++) { // 반복문을 3까지 실행
			tv[i] = new Television(); // tv 객체를 3개 생성
		}
		tv[0].channel = 7; // 1번째 tv 채널 7로 초기화
		tv[1].channel = 7; // 2번째 tv 채널 7로 초기화
		tv[2].channel = 11; // 3번째 tv 채널 11로 초기화
		for(int k=0; k < 3; k++) {

			System.out.println("채널 :" + tv[k].channel); // 결과 출력
		}
	}

}
