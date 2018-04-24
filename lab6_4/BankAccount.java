/*
 * 과제코드 : lab6_4
 * 작성자 : 김유진
 * 작성일 : 2018.04.24
 * 내용 : 은행계좌를 나타내는 클래스 
 */
package lab6_4;

public class BankAccount { // 필드와 메소드 그리고 정적 변수와 정적 상수를 포함한 클래스 정의  
	private int banknum; // 계좌번호에 대한 변수 
	private int balance; // 잔액에 대한 변수 
	private static int bankcounters = 0; // 계좌수에 대한 정적 변수 bankcounters 선언과 동시에 0으로 초기화 
	public static final int MIN_BALANCE = 100; // 출금 최소 단위에 대한 정적 상수 MIN_BALANCE 선언과 동시에 100으로 초기화  
	
	public BankAccount() { // 매개변수 없이 잔액은 0으로 초기화하고, 계좌번호는 계좌 생성 순서대로 1, 2, 3으로 초기화 
		this.balance = 0; // 잔액 필드를 0으로 초기화 
		BankAccount.bankcounters++; // 계좌수를 1증가
		this.banknum = bankcounters; // 계좌번호 필드를 계좌수로 초기화 
	}
	public String toString() { // 문자열에 대한 toString 메소드 정의
		String banknum = Integer.toString(this.banknum); // 계좌번호를 문자열로 변환 
		String balance = Integer.toString(this.balance); // 잔액을 문자열로 변환 
		return "계좌번호 :" + " " + banknum + " 잔액 :" + balance; // 계좌번호와 잔액을 문자열로 반환 
	}
	public static int Counters() { // 계좌수에 대한 정적 메소드 
		return bankcounters; // 계좌수 반환 
	}
}
