/*
 * 과제 코드 : hw7_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-10
 * 내용 : NormalAccount 클래스
 */
package hw7_1;

public class NormalAccount extends BankAccount{ //BankAccount 클래스를 상속하는 클래스 정의 
	public NormalAccount(int banknum, int balance) { // 계좌번호와 잔액을 매개변수로 받아 초기화하는 생성자 정의
		super(banknum, balance); // BankAccount 클래스의 계좌번호와 잔액 필드를 로드
	}
	
	public NormalAccount(int banknum) { // 계좌번호를 매개변수로 받아 초기화하는 생성자 정의 
		super(banknum); // BankAccount 클래스의 계좌번호 필드를 로드
	}
	
	@Override // 출금 메소드 재정의
	public void withdraw(int amount) { // 출금 메소드 오버라이드
		if (amount > super.getBalance()){ // 만약 BankAccount의 getBalance() 값이 amount 값보다 작다면
			System.out.println("계좌 :" + banknum + " " + "잔액이 부족하여 출금 실패"); // 출금 실패에 대한 출력문 출력
		}
		else { // 그 것이 아니라면 
			super.withdraw(amount); // BankAccount에 있는 출금 메소드를 위의 메소드로 매개변수만큼 출금
		}
	}
}	
