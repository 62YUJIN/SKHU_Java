/*
 * 과제코드 : mid1_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-08
 * 내용 : 사원 드라이버 클래스 
 */
package mid1_2;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("mid1_2 : 김유진"); // 과제 정보 출력
		Employee emp1 = new Employee("kim", 8000, 11); // emp1 이라는 사원 객체 생성 후 초기화 
		Employee emp2 = new Employee("lee"); // emp2 이라는 사원 객체 생성 후 초기화
		
		Compare(emp1, emp2); // emp1과 emp2가 서로 똑같은지 출력 
		Compare(emp2, emp1); // emp2와 emp1이 서로 똑같은지 출력
	}
	private static void Compare(Employee e1, Employee e2){ // 두 사원 객체를 비교하기 위한 클래스
		if(e1.getSalary() > e2.getSalary()) // 만약 매개변수로 받은 Employee형 e1의 봉급 e2의 봉급보 크다면
			System.out.println(e1.getName()); // e1의 이름 출력
		else if(e1.getSalary() < e2.getSalary()) // 만약 매개변수로 받은 Employee형 e2의 봉급이 e1의 봉급보 크다면
			System.out.println(e2.getName()); // e2의 이름 출력 
		else if(e1.getSalary() == e2.getSalary()) // 서로 같다면 
			System.out.println("봉급이 동일 합니다."); // 봉급이 동일하다는 메세지를 적절히 출력
	}
}
