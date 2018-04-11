/*
 * 과제코드 : lab5_5
 * 작성자 : 김유진
 * 작성일 : 2018.4.10
 * 내용 : String Class 연습
 */
package lab5_5;

import java.util.Scanner; // 사용자에게 입력을 받기 위한 Scanner 유틸리티 import

public class PracticeString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // input이라는 새로운 Scanner 생성
		System.out.println("lab5_5 : 김유진"); // 과제 정보 출력

		System.out.print("길이가 5 이상인 문자열 입력 :"); // 사용자에게 문자열을 입력받을 출력문
		String s1 = input.nextLine(); // s1 변수에 문자열 입력
		System.out.print("길이가 5 이상인 문자열 입력 :"); // 사용자에게 문자열을 입력받을 출력문
		String s2 = input.nextLine(); // s2 변수에 문자열 입력

		System.out.println("s1의 길이 :" + s1.length()); // s1의 길이를 출력
		System.out.println("s1의 첫번째 문자 :" + s1.charAt(0)); // s1의 첫번째 문자 출력
		System.out.println("s1의 두번째 ~ 네번째 부분문자열 :" + s1.substring(1, 4)); // s1의 두번째 ~ 네번째 부분문자열 출력
		System.out.println("s1을 대문자로 변경한 결과 :" + s1.toUpperCase()); // s1의 문자열을 대문자로 변경한 값 출력
		System.out.println("s1과 s2가 동일한지 여부 :" + s1.equals(s2)); // s1과 s2의 값 동일 여부에 대한 결과를 출력
		System.out.println("s1과 s2가 대소문자 구분 없애면 동일한지 여부 :" + s1.equalsIgnoreCase(s2)); // s1과 s2의 대소문자 구분없이 동일한가에 대한 여부 출력
		System.out.println("s1과 s2를 사전적으로 비교한 결과 :" + s1.compareTo(s2)); // s1과 s2를 사전적으로 비교한 결과 출력
	}

}
