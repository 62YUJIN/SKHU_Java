/*
 * 과제코드 : mid1_3
 * 작성자 : 김유진 
 * 작성일 : 2018-05-09
 * 내용 : 은행계좌 클래스
 */
package mid1_3;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("mid1_3 : 김유진"); // 과제 정보 출력 
		System.out.println(Account.FEE); // 송금수수료 출력: 500이라는 리터럴을 적으면 안됨
		System.out.println(Account.getNumber()); // 생성된 계좌수 출력: 0이라는 리터럴을 적으면 안됨

		Account a1 = new Account(5000); // 잔액이 5000인 계좌 객체 a1 생성
		Account a2 = new Account(2000); // 잔액이 2000인 계좌 객체 a2 생성

		boolean result = a1.transfer(a2, 5000); // a1에서 a2로 5000원 송금 시도 --> 실패
		System.out.println(result); // false

		result = a1.transfer(a2, 4500); // a2에서 a1으로 4500원 송금 시도 --> 성공 
		System.out.println(result); // true

		System.out.println(a1); // a1의 계좌 정보 출력
		System.out.println(a2); // a2의 계좌 정보 출력
	}

}
