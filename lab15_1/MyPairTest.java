/*
 * 과제코드 : lab15_1
 * 작성자 : 김유진
 * 작성일 : 2018-06-07
 * 내용 : 제네릭 클래스 연습
 */
package lab15_1;

//MyPair 객체를 생성하고 이용하는 프로그램
public class MyPairTest {
	public static void main(String[] args) {
		System.out.println("lab15_1: 김유진");

		// 문자열을 주/종 원소로 갖는 MyPair 객체 pair를 생성
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");

		// 주 원소를 변수에 저장 후 출력
		String master = pair.getMaster();
		System.out.println(master + "팀");

		// pair를 출력
		System.out.println(pair);

		// pair의 주/종 원소를 교환
		pair.swap();

		// pair를 출력
		System.out.println(pair);
		
		System.out.println(); // 출력 결과문 가독성 증가를 위한 코드
		
		// 두 학생 객체를 생성
		Student<String> s1 = new Student<String>("Kim");
		Student<String> s2 = new Student<String>("Park");

		// MyPair의 studentPair 생성
		MyPair<Student> studentPair = new MyPair<Student>(s1, s2);

		// studentPair 출력
		System.out.println(studentPair);

		// studentPair의 주/종 원소를 교환
		studentPair.swap();

		// studentPair 출력
		System.out.println(studentPair);
		
		System.out.println(); // 출력 결과문 가독성 증가를 위한 코드
		
		// 두 정수 객체를 생성
		Integer i1 = new Integer(11);
		Integer i2 = new Integer(22);

		// MyPair의 studentPair 생성
		MyPair<Integer> integerPair = new MyPair<Integer>(i1, i2);

		// studentPair 출력
		System.out.println(integerPair);

		// studentPair의 주/종 원소를 교환
		integerPair.swap();
		
		// studentPair 출력
		System.out.println(integerPair);
	}
}


//String형 주/종 원소를 저장하는 클래스
class MyPair<S> {
	private S master; // 주 원소
	private S slave; // 종 원소

	public MyPair(S master, S slave) { // 생성자
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  주/종 원소를 교환하는 메소드
		S temp = master;
		master = slave;
		slave = temp;
	}

	public S getMaster() {
		return master;
	}

	public S getSlave() {
		return slave;
	}

	@Override
	public String toString() { 
		return "주=" + master + " 종=" + slave;
	}
}


class Student<S> {
	private S name;
	public Student(S name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return (String)name;
	}
}