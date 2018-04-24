/*
 * 과제코드 : mid
 * 작성자 : 김유진
 * 작성일 : 2018.04.24
 * 내용 : Book Class 정의
 */

package mid;

public class Book {
	private String title; // private 필드 도서명에 대한 문자열 변수
	private int price; // private 필드 가격에 대한 정수형 변수

	public Book(String title, int price) { // 도서명과 가격을 매개변수로 받는 Book 메소드 정의
		this.title = title; // 필드 title 변수에 매개변수 title 삽입
		this.price = price; // 필드 price 변수에 매개변수 price 삽입
	}

	public String getTitle() { // 도서명을 반환하는 getter getTitle 정의
		return title; // 도서명 값 반환
	}

	public int getPrice() { // 가격을 반환하는 getter getPrice 정의
		return price; // 가격 값 반환
	}

	public int Raise(int price) { // 가격을 매개변수로 받는 가격인상에 대한 메소드 정의
		this.price += price; // price 변수에 매개변수 price 삽입
		return price; // 가격 값 반환
	}

}
