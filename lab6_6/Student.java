/*
 * 과제 코드 : lab6_6
 * 작성자 : 김유진
 * 작성일 : 2018.04.24
 * 내용 : 이름, 도시, 국가 정보를 갖는 학생을 표현하기 위해 Student 클래스 정의 
 */
package lab6_6;

public class Student {
	private class Address {

		String city; // 도시명에 대한 문자열 변수 city 선언
		String country; // 국가명에 대한 문자열 변수 country 선언

		private Address(String city, String country) { // 도시와 국가명을 매개변수로 받는 private inner class인 Address 정의
			this.city = city; // 매개변수로 받은 도시명을 city 필드에 삽입
			this.country = country; // 매개변수로 받은 국가명을 country 필드에 삽입
		}
	}

	private String name; // private 문자열 변수 name 선언
	private Address address; // private Address형 변수 address 선언

	public Student(String name, String city, String country) { // 이름과 도시명과 국가명을 매개변수로 받는 생성자 정의
		this.name = name; // 매개변수로 받은 이름을 필드 name에 삽입
		address = new Address(city, country); // 도시와 국가명에 대한 주소 생성
	}

	public String getName() { // 이름을 반환하는 getter
		return name; // 이름을 반환
	}

	public String getCity() { // 도시명을 반환하는 getter
		return address.city; // 도시명을 address에 반환
	}

	public String getCountry() { // 국가명을 반환하는 getter
		return address.country; // 국가명을 address에 반환
	}

	public void move(String city, String country) { // 도시와 국가를 이사하는 메소드 정의
		address.city = city; // 매개변수로 받은 도시명을 address에 존재하는 city에 삽입
		address.country = country; // 매개변수로 받은 국가명을 address에 존재하는 country에 삽입
	}

	@Override // 오버라이딩
	public String toString() { // 문자열 반환에 관한 toString 메소드
		return "name :" + " " + name + " city :" + " " + address.city + " " + " country :" + " " + address.country; // 이름, 도시, 국가명을 문자열로 반환
	}
}
