/*
 * 과제코드 : lab7_1
 * 작성자 : 김유진
 * 작성일 : 2018-05-08
 * 내용 : protected 드라이버 클래스
 */
package lab7_1;

public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager(); // 매니저 객체를 생성 
		m.setSalary(1000); // 매니저의 봉급을 지정
		m.setBonus(500); // 매니저의 보너스를 지정 
		System.out.println(m.getSalary()); // 봉급 출력
		System.out.println(m.getBonus()); // 보너스 출력 
		System.out.println(m.getTax()); // 세금액 출력
	} 
}
