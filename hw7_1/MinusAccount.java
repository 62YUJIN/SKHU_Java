/*
 * 과제 코드 : hw7_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-10
 * 내용 : MinusAccount 클래스
 */
package hw7_1;

public class MinusAccount extends BankAccount{
	private int aLoanCeiling; // 대출한도 필드
	
	// 대출한도를 매개변수로 받아 초기화하는 생성자
	public MinusAccount(int banknum ,int aLoanCeiling) {
		super(banknum, aLoanCeiling);
		this.aLoanCeiling = aLoanCeiling;
	}
	
	// 계좌번호, 잔액, 대출한도를 매개변수로 받아 초기화하는 생성자
	public MinusAccount(int banknum, int balance, int aLoanCeiling) {
		super(banknum, balance + aLoanCeiling);
		this.aLoanCeiling = aLoanCeiling;
	}
	
	// 대출한도를 반환하는 대출한도 getter
	public int getALoanCeiling() {
		return aLoanCeiling;
	}
	
	// 출금 메소드 재정의
	@Override
	public void withdraw(int amount) {
		if ( amount > super.getBalance()){
			System.out.println("계좌 :" + banknum + " " + "잔액이 부족하여 출금 실패");
		}
		else {
			super.withdraw(amount);
		}
	}
}	
