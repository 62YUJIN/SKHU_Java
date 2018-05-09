/*
 * 과제코드 : mid1_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-08
 * 내용 : 돼지 저금통 드라이버 클래스
 */
package mid1_1;

public class PiggyBankTest {

	public static void main(String[] args) {
		System.out.println("mid1_1 : 김유진"); // 과제 정보 출력
		PiggyBank bank = new PiggyBank(1, 1); // bank라는 이름의 새로운 저금통 생성과 동시에 매개변수로 초기화
		bank.add(2, 10); // 500원과 100원 동전을 각각 추가
		bank.add(0, 1); // 100원 동전만 추가
		bank.add(0, 1); // 100원 동전만 추가
		
		System.out.println(bank.open()); // 돼지 저금통을 열어 저금된 금액을 출력하고 금액을 0으로 초기화 
		
		bank.add(1, 1); // 500원과 100원 동전을 각각 추가
		
		System.out.println(bank.open()); // 돼지 저금통을 열어 저금된 금액을 출력하고 금액을 0으로 초기화
	}
}
