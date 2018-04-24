/*
 * 과제코드 : mid
 * 작성자 : 김유진
 * 작성일 : 2018.04.24
 * 내용 : Book Class 정의
 */
package mid;

public class BookTest {

	public static void main(String[] args) {

		System.out.println("mid: 김유진"); // 과제 정보 출력
		Book book1 = new Book("Java", 20000); // Book 객체 book1에 도서명 : "Java", 가격 : 20000 초기화
		Book book2 = new Book("Database", 30000); // Book 객체 book2에 도서명 : "Database", 가격 : 30000 초기화
		midExam(book1); // book1에 대한 작업을 수행하는 midExam() 메소드 호출
		midExam(book2); // book2에 대한 작업을 수행하는 midExam() 메소드 호출

	}

	private static void midExam(Book book) {

		System.out.println(book.getTitle()); // 매개변수로 받은 book의 도서명 출력
		System.out.println(book.getPrice()); // 매개변수로 받은 book의 가격 출력

		book.Raise(1000); // book 가격을 1000원 인상
		System.out.println(book.getPrice()); // book의 가격 출력

		book.Raise(book.getPrice()/(100/50)); // book 가격을 50% 인상
		System.out.println(book.getPrice());// book의 가격 출력

	}

}
