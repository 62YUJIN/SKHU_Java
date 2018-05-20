/*
 * 과제 코드 : hw7_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-10
 * 내용 : BankAccount, NormalAccount, MinusAccount 드라이버 클래스
 */
package hw7_1;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("hw7_1 : 김유진"); // 과제 정보 출력

		// 일반 계좌 : 계좌번호 11, 잔액 1000으로 초기화
		NormalAccount n_acc = new NormalAccount(11, 1000); 
		// 일반 계좌 : 계좌번호 22로 초기화 
		NormalAccount n_acc2 = new NormalAccount(22);
		// 마이너스 계좌 : 계좌번호 33, 잔액 1000, 대출한도 500으로 초기화
		MinusAccount m_acc = new MinusAccount(33, 1000, 500);
		// 마이너스 계좌 : 계좌번호 44, 대출한도 500으로 초기화
		MinusAccount m_acc2 = new MinusAccount(44, 500);

		// 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("최대 출금 가능액");
		System.out.println("n_acc :" + " " + n_acc.getBalance());
		System.out.println("n_acc2 :" + " " + n_acc2.getBalance());
		System.out.println("m_acc :" + " " + m_acc.getBalance());
		System.out.println("m_acc2 :" + " " + m_acc2.getBalance());
		
		// 줄바꿈
		System.out.println();
		
		// 4개 계좌에서 500을 출금하고 각각 정보를 출력 
		System.out.println("출금액 입력: 500");
		n_acc.withdraw(500);
		n_acc2.withdraw(500);
		m_acc.withdraw(500);
		m_acc2.withdraw(500);
		System.out.println();
		
		// 4개의 계좌에서 100을 입금하고 각각 정보를 출력
		System.out.println("입금액 입력: 100");
		n_acc.deposit(100);
		n_acc2.deposit(100);
		m_acc.deposit(100);
		m_acc2.deposit(100);
		
		// 줄바꿈 
		System.out.println();
		
		// 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("최대 출금 가능액");
		System.out.println("n_acc" + " " + n_acc.getBalance());
		System.out.println("n_acc2" + " " + n_acc2.getBalance());
		System.out.println("m_acc" + " " + m_acc.getBalance());
		System.out.println("m_acc2" + " " + m_acc2.getBalance());
	}
}
