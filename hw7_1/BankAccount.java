/*
 * 과제 코드 : hw7_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-10
 * 내용 : 은행계좌 클래스를 상속하는 일반계좌, 마이너스계좌 클래스를 정의하고 사용하는 프로그램
 */
package hw7_1;

public class BankAccount {
	protected int banknum; // protected 접근제어자를 활용하여 계좌번호 정수형 필드 생성
	private int balance; // private 접근제어자를 활용하여 잔액 정수형 필드 생성
	
	public BankAccount(int banknum, int balance) { // 계좌번호와 잔액을 매개변수로 받아 초기화하는 생성자 정의
		this.banknum = banknum; // 매개변수로 받은 계좌번호 값을 계좌번호 필드에 저장
		this.balance = balance; // 매개변수로 받은 잔액 값을 잔액 필드에 저장
	}
	public BankAccount(int banknum) { // 계좌번호를 매개변수로 받아 초기화 하는 생성자 정의
		this.balance = 0; // 잔액은 0으로 초기화 
		this.banknum = banknum; // 매개변수로 받은 계좌번호 값을 계좌번호 필드에 저장 
	}
	public int getBalance() { // 잔액 getter
		return balance; // 잔액 반환
	}
	public void deposit(int amount) { // 입금에 대한 메소드 
		System.out.println("계좌번호 :" + banknum + " " + balance + "원 입금"); // 입금할 때 적절한 출력문 출력 
		this.balance += amount; // 잔액에 amount 매개변수 값만큼 잔액에 더하기
	}
	public void withdraw(int amount) { // 출금에 대한 메소드
		System.out.println("계좌번호 :" + banknum + " " + balance + "원 출금"); // 출금할 때 적절한 출력문 출력
		this.balance -= amount; // 잔액에 amount 매개변수 값만큼 잔액에서 빼기 
	}
}
