/*
 * 과제코드 : hw2_1
 * 학번 : 201732008
 * 작성자 : 김유진
 * 작성일 : 2017.03.17
 * 내용 : 달러환전
 */
package hw2_1;

import java.util.Scanner;

public class Exchange {

	public static void main(String[] args) {
		
		final int EXCHANGE_RATE = 1060; // 환율 1060원을 상수로 선언할 int형 EXCHANGE_RATE 정의
		
		Scanner input = new Scanner(System.in); // Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
        
		System.out.println("hw2_1 : 김유진\n"); // 과제코드와 작성자의 정보를 출력하는 출력문
        
		System.out.println("500원 갯수 입력 :"); // 500원 갯수 입력에 대한 출력문 
		int fhw = input.nextInt(); // 500원의 갯수를 입력받기 위한 fivehundredwon의 약자 fhw 선언과 동시에 입력
        
		System.out.println("100원 갯수 입력 :"); // 500원 갯수 입력에 대한 출력문
        int ohw = input.nextInt(); // 100원의 갯수를 입력받기 위한 onehundredwon의 약자 ohw 선언과 동시에 입력
        
        System.out.println("50원 갯수 입력 :"); // 500원 갯수 입력에 대한 출력문
        int ftw = input.nextInt(); // 50원의 갯수를 입력받기 위한 fithtywon의 약자 ftw 선언과 동시에 입력
        
        System.out.println("10원 갯수 입력 :"); // 500원 갯수 입력에 대한 출력문
        int tnw = input.nextInt(); // 10원의 갯수를 입력받기 위한 tenwon의 약자 tnw 선언과 동시에 입력
        
        int sum = ((500*fhw) + (100*ohw) + (50*ftw) + (10*tnw)); // 사용자가 입력한 갯수만큼 총액을 연산하여 결과 값을 저장하는 sum 선언
        int remain = sum - EXCHANGE_RATE; // 총액에서 환율계산이 끝나고 남은 한화의 액수를 표현하기 위한 변수 remain 선언
        int dollorcount = sum / EXCHANGE_RATE; // 달러 액수를 표현하기 위한 변수 dollorcount 선언
        
        System.out.print("\n저금 총액 = " + sum); // 저금 총액 결과 출력
        System.out.print("\n달러 액수 = " + dollorcount); // 달러 액수 결과 출력
        System.out.print("\n남은 한화 = " + remain); // 남은 한회 결과 출력
    }
}

