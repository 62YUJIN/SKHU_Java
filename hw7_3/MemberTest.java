/*
 * 과제 코드 : hw7_3
 * 작성자 : 김유진
 * 작성일 : 2018-05-23
 * 내용 : 추상 클래스
 */
package hw7_3;

public class MemberTest {

	public static void main(String[] args) {
		System.out.println("hw7_3 : 김유진(과제 코드가 동일하여 중복때문에 7_3으로 설정)"); // 과제 정보
		Member[] m = new Member[4]; // 크기가 4인 Member 배열 생성

		// 배열에 객체를 저장
		m[0] = new HourlyMember(22, 2);
		m[1] = new HourlyMember(33, 3);
		m[2] = new RegularMember(44);
		m[3] = new RegularMember(55);

		int sum = 0; // 나이 합계를 위한 변수 선언과 동시에 초기화
		double average = 0.0; // 평균계산을 위한 변수 선언과 동시에 초기화
		for(int i = 0; i < m.length; i++) { // 배열의 길이까지 반복문 실행
			sum += m[i].getAge(); // 배열의 나이를 sum에 저장
			average = (double)sum / m.length; // 배열의 길이로 합계를 나누어 average에 저장
		}
		System.out.println("나이 평균 : " + " " + average); // 나이 평균 출력
		
		int paysum = 0; // 회비 합계를 위한 변수 선언과 동시에 초기화
		for(int i = 0; i < m.length; i++) { // 배열의 길이만큼 반복문 실행
			paysum += m[i].getPayment(); // getPayment로 회비 값을 호출 후 paysum에 저장 
		}
		System.out.println("회비 합 : " + " " + paysum); // 회비 합 출력
	}

}
