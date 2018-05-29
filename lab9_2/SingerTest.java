/*
 * 과제코드 : lab9_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-29
 * 내용 : 패키지
 */
package test;

import mic.MicSystem;
//Singer 인터페이스를 테스트하는 클래스
public class SingerTest {
	public static void main(String[] args) {
		System.out.println("lab9_2: 김유진");

		// 마이크 시스템 객체를 생성
		MicSystem mic = new MicSystem();

		// Person 객체를 생성하여 마이크 테스트 매개변수로 전달
		mic.micTest(new Person());
	}
}
