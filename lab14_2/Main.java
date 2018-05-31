/*
 * 과제코드 : lab14_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-31
 * 내용 : 오류처리
 */
package lab14_2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_2: 김유진"); // 과제 정보 출력

		Scanner i = new Scanner(System.in); // 입력기 선언

		int x, y, result; // 정수형 변수 x, y, result 선언
		try { // 예외처리에서 던지는 문장(예외가 발생 할 수 있는 문장 삽입)
			System.out.print("정수 x 입력: "); // x 입력문에 대한 출력문
			x = i.nextInt(); // x 입력문
			System.out.print("정수 y 입력: "); // y 입력문에 대한 출력문
			y = i.nextInt(); // y 입력문
			result = x / y; // result는 x와 y의 나누기 계산 값을 저장
		} 

		catch(ArithmeticException e) { // 예외처리에서 잡는 문장(예외를 잡아주는 변수와 그에 대한 문장 삽입)
			result = 0; // result = 0 출력
		}
		catch(InputMismatchException e) { // 예외처리에서 잡는 문장(예외를 잡아주는 변수와 그에 대한 문장 삽입)
			result = 1; // result = 1 출력
		}
		System.out.println("result = " + result); // 결과 출력
	}
}