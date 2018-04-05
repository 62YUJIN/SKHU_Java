/*
 * 과제코드 : lab5_3
 * 작성자 : 김유진
 * 내용 : 은행계좌 
 */
package lab5_3;

public class BankAccount {
	int balance; // 잔액에 대한 값을 저장하기 위한 정수형 변수 balance 선언 
	
	int deposit(int money) { // 입금을 할 수 있는 정수형 deposit 메소드 정의 후 정수형 매개변수 money 선언 
		
		balance += money; // balance에 money의 값을 삽입
		 
		return balance; // balance 반환 
	}
	int withdraw(int money) { // 출금을 위한 정수형 메소드 withdraw 정의 후 정수형 매개변수 money 선언  
		
		balance -= money; // 현재 잔액에서 매개변수의 금액을 감소 
		
		return balance; // 잔액 반환 
	}
	void getBalance() { // 잔액 필드를 출력하기 위한 메소드 getBalance 정의 
		
		System.out.println("계좌의 잔액 :" + balance); // 계좌의 잔액을 출력 
	}
}
