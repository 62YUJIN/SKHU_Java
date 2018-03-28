/*
 * 과제코드 : hw4_1
 * 작성자 : 김유진
 * 작성일 : 2017.3.28
 * 내용 : 하한 ~ 상한 범위의 여러 학생 나이를 입력받아 각 연령의 학생이 몇명씩인가 세는 프로그램
 */
package hw4_1;

import java.util.Scanner; // Scanner 유틸리티 임포

public class CountStd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		
		System.out.println("hw4_1 : 김유진\n"); // 과제 정보 출
		
		System.out.println("나이 하한 입력 :");int lowage = input.nextInt(); // 나이 하한을 입력을 위한 출력문, 하한을 입력받는 변수 lowage 선언
		System.out.println("나이 상한 입력 :");int highage = input.nextInt(); // 나이 상한을 입력을 위한 출력문, 하한을 입력받는 변수 highage 선언 
		System.out.println("학생 수 입력 :");int stdcount = input.nextInt(); //학생 수 입력을 위한 출력문, 하한을 입력받는 변수 stdcount 선언 
		
		int[] stdarray= new int[stdcount]; // 학생의 나이를 저장하기 위한 배열 stdarry 선언
		
		for(int i = 0; i < stdcount; i++) { // 반복문을 위한 변수 i 선언 학생 수 만큼 반복문 실행 
			
			System.out.println("나이 입력 :"); // 나이를 입력하기 위한 출력
			int n = input.nextInt(); // 사용자가 입력한 나이 값을 정수형 변수 n에 저장 
			
			if(n < lowage || n > highage) { // 만약 n이 하한보다 낮거나 또는, 상한보다 클경우, 
				System.out.println("범위를 벗어났습니다. 다시 입력하세요."); // 적절한 멘트를 출
				--i; // 감소후 i를 다시 실행 
			}
			
			else if(n >= lowage && n <= highage) { // 만약 n이 하한보다 크거나 같고, 상한보다 작거나 같으면,
				stdarray[i] += n; // 학생의 나이를 저장하는 배열에 입력받은 나이를 저 
			}
			
		}
		System.out.println("나이 학생수\n"); // 나이와 학생수를 한줄씩 출력하는 출력
		for(int j = lowage; j <= highage ; j++) { // 반복문의 j가 하한부터 시작하고, 상한까지 실
			int stdnum = 0; // 나이에 맞는 학생 수를 출력하기 위한 변수 선언 
			for(int k = 0; k < stdarray.length; k++) { // 반복문의 k가 0부터 배열의 길이만큼 실행 
				if(stdarray[k] == j) { // 만약 k번쨰의 학생의 나이가 j와 같다면 
					stdnum += 1; // 나이에 맞는 학생 수의 갯수를 1씩 증가 
				}
			}
			System.out.println(j +" "+ stdnum); // 나이와 학생 수를 출력하는 출력문 
			stdnum = 0; // 학생 수를 0으로 초기화 
		}
	}

}
