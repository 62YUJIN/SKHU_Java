/*
 * 과제 코드 : lab16_1
 * 작성자 : 김유진
 * 작성일 : 2018-06-14
 * 내용 : Thread 연습
 */

package lab16_1;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println("lab16_1: 김유진"); // 과제 정보 출력
		Thread t1 = new Thread(() -> {  // Thread 객체를 생성과 동시에 람다식 문장으로 초기화
			for(int i = 1; i <= 10; i++) // 반복문 10번 실행 
				System.out.print(i + " "); // i를 반복문 횟수만큼 1씩 증가하면서 출력 
		});
		t1.start(); // Thread 객체 t1 실행
		for(int i = 21; i <= 30; i++) // 반복문 21 부터 30까지 실행
			System.out.print(i + " "); // i를 반복문 횟수만큼 1씩 증가하면서 출력
	}
}