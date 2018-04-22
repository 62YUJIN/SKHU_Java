/*
 * 과제코드 : hw6_2
 * 작성자 : 김유진
 * 작성일 : 2018.04.23
 * 내용 : 은행계좌를 나타내는 클래스의 드라이버 클래스
 */
package hw6_2; 

public class BankAccountTest {

	public static void main(String[] args) {
		System.out.println("hw6_2 : 김유진"); // 과제 정보 출력
		
		BankAccount a1 = new BankAccount(1, "kim", 9000); // 계좌번호 1, 잔액 9000, 예금주 kim으로 초기화한 계좌 a1 생성
		BankAccount a2 = new BankAccount(2, "lee"); // 계좌번호 1, 예금주 lee로 초기화한 계좌 a2 생성
		
		a2.giveBalance(6000); // 사용자로부터 입력받은 금액을 accounter2에 입금
		a2.takeBalance(3000); // 사용자로부터 입력받은 금액을 accounter2에 출금
		
		a2.giveBalance(8000); // 사용자로부터 입력받은 금액을 accounter2에 입금 
		a2.takeBalance(5000); // 사용자로부터 입력받은 금액을 accounter2에 출금 
		
		a2.Send(a1, 1000); // 사용자로부터 송금액을 입력받아 accounter2에게 accounter1로 송금하도록 지시
		a2.Send(a1, 500); // 사용자로부터 송금액을 입력받아 accounter2에게 accounter1로 송금하도록 지시
		
		a2.setAccounter("park"); // accounter2의 예금주 이름을 park으로 변경  
		
		System.out.println(a2.toString()); // account2의 계좌번호, 예금주명, 잔액 출력
		System.out.println(a1.toString()); // account1의 계좌번호, 예금주명, 잔액 출력
	}

}
