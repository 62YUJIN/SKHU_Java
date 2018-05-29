/*
 * 과제코드 : lab9_2
 * 작성자 : 김유진
 * 작성일 : 2018-05-29
 * 내용 : 패키지
 */
package test;

import mic.Singer;

//Singer를 구현한 Person 클래스
public class Person implements Singer {
	public void sing() {
		System.out.println("도레미파솔라시도");
	}
}
