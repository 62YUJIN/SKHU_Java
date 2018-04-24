/*
 * 과제코드 : lab6_4
 * 작성자 : 김유진
 * 작성일 : 2018.04.24
 * 내용 : 은행계좌를 나타내는 클래스를 사용할 드라이버 클래스
 */
package lab6_4;

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("lab6_4 : 김유진"); // 과제 정보 출력 
		
		System.out.println("계좌수 :" + " " + BankAccount.Counters()); // 계좌수 출력 
		System.out.println("잔액 최소단위 :" + " " + BankAccount.MIN_BALANCE); // 최소 출금 단위 출력 
		
		BankAccount account1 = new BankAccount(); // 계좌 생성 
		BankAccount account2 = new BankAccount(); // 계좌 생성 
		
		System.out.println("계좌수 :" + " " + BankAccount.Counters()); // 계좌수 출력 
		System.out.println(account1.toString()); // 계좌에 대한 toString 출력 
		System.out.println(account2.toString()); // 계좌에 대한 toString 출력
	}

}
