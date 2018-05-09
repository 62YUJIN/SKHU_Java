/*
 * 과제코드 : mid1_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-08
 * 내용 : 돼지 저금통 클래스 
 */
package mid1_1;

public class PiggyBank {
	// 2개의 private 필드 
	private int five; // 500원 개수를 저장하기 위한 정수형 필드
	private int one; // 100원 개수를 저장하기 위한 정수형 필드
	
	public PiggyBank(int fhw, int ohw) { // 500원 개수와 100원 개수를 매개변수로 받는 메소드
		five = fhw; // 정수형 필드에 매개변수 값을 저장 
		one = ohw; // 정수형 필드에 매개변수 값을 저장 
	}
	public void add(int fhw, int ohw) { // 500원 개수와 100원 개수를 매개변수로 받아 그 수 만큼 금액을 저금하는 메소드 
		five += fhw; // 정수형 필드에 매개변수 값을 저금
		one += ohw; // 정수형 필드에 매개변수 값을 저금
	}
	public int open() { // 돼지저금통을 열어주는 메소드
		int balance = five * 500 + one * 100; // 저금된 잔액을 저장하기 위한 변수 balance 선언과 동시에 초기화
		five = 0; // 500원의 필드를 0으로 전환 
		one = 0; // 100원의 필드를 0으로 전환 
		return balance; // 저금된 금액 반환
	}
}
