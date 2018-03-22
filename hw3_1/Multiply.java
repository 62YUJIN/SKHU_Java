/*
 * 과제코드 : hw3_1
 * 작성자 : 김유진 
 * 작성일 : 2017.03.22
 * 내용 : 곱셈시험
 */
package hw3_1;

import java.util.Scanner; //키보드 입력을 위한 유틸리티 가져오기
import java.util.Random; //랜덤 수를 만들기 위한 유틸리티 가져오기

public class Multiply {

	public static void main(String[] args) {
		
		Random generator = new Random(); // 랜덤 수를 만들기 위한 generator 생성
		Scanner input = new Scanner(System.in); //Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		
		System.out.println("hw3_1 : 김유진\n");
		System.out.println("곱셈 문제의 답을 입력하세요(통과하려면 0을 입력).\n");
		int ans = 0; int wans = 0; int sum = 0; //정답수, 오답수, 총점을 저장하기 위한 변수 선언과 동시에 0으로 초기화
		
		for(int i = 0; i < 5; i++) { //반복문 시작 1~5까지
			
			int num1 = generator.nextInt(9)+1; //1~9까지의 수를 랜덤으로 출력하여 변수 num1에 저장
			int num2 = generator.nextInt(9)+1; //1~9까지의 수를 랜덤으로 출력하여 변수 num2에 저장
			System.out.println(num1 + " * " + num2 + " = ? "); // 곱셈식을 사용자에게 보여주는 출력문
			int mulint = input.nextInt(); //사용자가 입력한 곱셈식의 값을 저장하는 mulint변수 선언 
			
			if(mulint == num1 * num2) { //만약 입력받은 값이 num1 * num2의 값과 같다면,
				System.out.println("정답입니다.\n"); //정답임을 출력
				ans++; // 정답수 1씩 증가
				sum += 20; // 총점 20씩 증가
			}
			else if(mulint != num1 * num2 && mulint !=0) { //입력받은 값이 num1 * num2의 값과 다르고, 0이 아니라면
				System.out.println("틀렸습니다.\n"); //오답임을 출력
				wans++; // 오답수 1씩 증가
				sum -= 10; // 총점 -10씩 감소
			}
			else if(mulint == 0) { //입력받은 값이 0이라면,
				System.out.println("통과\n"); //통과임을 출력
			}
		}
		if(sum < 0) { // 만약 총점이 0보다 작은 수라면,
			sum = 0; // sum을 0으로 초기화
		}
		System.out.println("정답수 " + ans + "오답수" + wans + "총점 " + sum); // 정답수, 오답수, 총점을 출력
	}

}
