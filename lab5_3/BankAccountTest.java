/*
 * 과제코드 : lab5_3
 * 작성자 : 김유진
 * 내용 : 은행계좌 
 */
package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		
		System.out.println("lab5_3 : 김유진\n"); // 과제 정보 출력 
		
		BankAccount myAccount = new BankAccount(); // BankAccount에 대한 새로운 myAccount 생성  
		
		myAccount.deposit(2000); // myAccount의 BankAccount 클래스의 메소드 deposit 호출 
		myAccount.deposit(3000); // myAccount의 BankAccount 클래스의 메소드 deposit 호출 
		
		myAccount.getBalance(); // myAccount의 잔액을 조회하는 BankAccount 메소드 getBalance 호출 
		
		myAccount.withdraw(1000); // myAccount에서 1000원을 출금
		
		myAccount.getBalance(); // myAccount의 잔액을 조회하는 BankAccount 메소드 getBalance 호출 
	}

}