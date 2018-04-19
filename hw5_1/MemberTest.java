/*
 * 과제코드 : hw5_1
 * 작성자 : 김유진
 * 내용 : 회원을 나타내는 클래스를 사용할 드라이버 클래스 main 정의   
 */
package hw5_1;

public class MemberTest {

	public static void main(String[] args) {
		 
		System.out.println("hw5_1 : 김유진");
	      
		Member [] m = new Member[5]; // 크기가 5인 회원 배열을 생성
	    for (int i=0; i<5; i++) { // 반복문을 이용하여 회원 배열에 5명의 회원을 생성하여 지정
	    	m[i] = new Member();
	    }
	    for (int j=0; j<5; j++) { // 반복문을 이용하여 회원 5명의 등급을 1, 2, 3, 4, 5로 지정
	        m[j].giveRate(j+1);
	    }
	      for (int k=0; k<5; k++) {  // 반복문을 이용하여 회원 5명에게 포인트 지급
	    	m[k].givePoint();  
	      }
	      for (int p=0; p<5; p++) {  // 반복문을 이용하여 회원 5명에게 포인트 지급
	        m[p].givePoint();
	      }
	      for (int l=0; l<5; l++) { // 회원 5명의 할인률을 조회하여 출력
	    	System.out.println(m[l].searchDiscount());  
	      }
	}
}
