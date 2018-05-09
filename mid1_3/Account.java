/*
 * 과제코드 : mid1_3
 * 작성자 : 김유진 
 * 작성일 : 2018-05-09
 * 내용 : 은행계좌 클래스
 */
package mid1_3;

public class Account {
	private int id; // 아이디 필드 
	private int balance; // 잔액 필드 
	private static int number; // 계좌 수 필드 
	public static final int FEE = 500; // 송금 수수료 필드 

	public Account(int b) {  
		Account.number++; // 계좌수를 1씩 증가
		this.id = Account.number; // 아이디를 계좌 생성 순으로 자동 부여
		this.balance = b; // 잔액은 매개변수로 받은 값으로 초기화 
	}

	public static int getNumber() { // 생성된 계좌수를 static 으로 반환하는 계좌수 getter 
		return number; // 계좌수 반환
	}

	public boolean transfer(Account other, int amount) { // 현재 계좌에서 상대 계좌 other로 amount 만큼 송금하는 메소드
		if(balance < amount + FEE) // 만약 잔액이 amount와 수수료를 더한 값보다 작다면 
			return false; // 불리언형 false 반환 
		balance -= FEE; // 잔액에서 송금수수료 삭감 
		balance -= amount; // 잔액에서 amount 만큼의 값을 삭감 
		other.balance += amount; // 다른 계좌의 잔액으로 amount 만큼 추가 
		return true; // 불리언형 true 반환 
	}
	
	@Override // 오버라이딩
	public String toString() { // 문자열 변환 출력을 위한 메소드
		return "id=" + id + ", balance=" + balance; // 아이디, 계좌수, 잔액을 순서대로 문자열로 반환
	}
}
