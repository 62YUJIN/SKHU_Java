/*
 * 과제코드 : hw6_2
 * 작성자 : 김유진
 * 작성일 : 2018.04.23
 * 내용 : 은행계좌를 나타내는 클래스
 */
package hw6_2;

public class BankAccount {
	private int banknum; // 계좌번호 필드 banknum 선언 
	private int balance; // 잔액 필드 balance 선언 
	private String accounter; // 예금주명 필드 accounter 선언
	
	public BankAccount(int banknum, String accounter, int balance) {
		if (balance < 0) { // 만약 잔액이 음수이면,
			this.balance = 0; // 잔액을 0으로 초기화 
		}
		else // 잔액이 음수가 아니라면
			this.banknum = banknum; // 매개변수로 받은 계좌번호를 계좌번호 필드에 저장
			this.accounter = accounter; // 매개변수로 받은 예금주를 예금주 필드에 저장
			this.balance = balance; // 매개변수로 받은 잔액을 잔액 필드에 저장
	}
	
	public BankAccount(int banknum, String accounter) {
		this(banknum, accounter, 0); // BankAccount에 매개변수로 받은 banknum, accounter 값을 저장 
	}

	public int getBanknum() { // 계좌번호의 getter
		return banknum; // 계좌번호를 반환  
	}

	public String getAccounter() { // 예금주의 getter
		return accounter; // 예금주를 반환 
	}

	public void setAccounter(String accounter) { // 예금주의 setter
		this.accounter = accounter; // 예금주 필드에 예금주 매개변수 값을 반환 
	}

	public int getBalance() { // 잔액의 getter 
		return balance; // 잔액을 반환 
	}
	
	public void giveBalance(int balance) { // 입금에 대한 메소드 
		if(balance > 0) { // 만약 매개변수로 받은 금액이 양수이면 
			this.balance += balance; // 금액을 잔액 필드에 반환 
		}
	}
	
	public void takeBalance(int balance) { // 출금에 대한 메소드 
		if(this.balance - balance < 0) { // 만약 잔액 필드에 매개변수 값 만큼 뺀 값이 음수이면, 
			System.out.println("출금 잔액이 부족합니다."); // 적당한 오류메세지 출력 
		}
		else // 그것이 아니라면 
			this.balance -= balance; // 잔액 필드에서 매개변수의 값 만큼 출금 
	}
	
	public void Send(BankAccount other, int balance) { // 송금에 대한 메소드 
	      if ((this.balance - balance) < 0) // 만약 잔액 필드에 매개변수 값 만큼 뺀 값이 음수이면 
	         System.out.println("송금 잔액이 부족합니다."); // 적당한 오류메세지 출력 
	      else { // 그것이 아니라면 
	         this.balance -= balance; // 잔액 필드에서 매개변수의 값 만큼 송금 
	         other.balance += balance; // other를 사용하여 송금할 잔액을 매개변수 만큼 더하기
	   }
	}
	
	public String toString() { // 문자열 메소드 
		String accounter = Integer.toString(this.banknum); // 계좌번호의 필드를 정수형에서 문자열로 변환 
		String balance = Integer.toString(this.balance); // 잔액의 필드를 정수형에서 문자열로 반환 
		return "계좌번호 : " + banknum + " 잔액 : " + balance + " 예금주 : " + this.accounter; // 계좌번호, 잔액, 예금주를 순서대로 문자열로 반환 
	}
}
