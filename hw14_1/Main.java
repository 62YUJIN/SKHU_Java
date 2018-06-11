/*
 * 과제 코드 : hw14_1
 * 작성자 : 김유진
 * 작성일 : 2018-06-11
 * 내용 : 예외처리
 */
package hw14_1;

import java.util.Scanner; // 입력 폼을 사용하기 위한 유틸리티 임포트

import java.util.InputMismatchException; // 입력된 값이 맞지 않을때 예외를 처리하기 위한 예외유틸리티 

public class Main {
	public static void main(String[] args) throws TooSmallException {
		System.out.println("hw14_1: 김유진"); // 과제 정보 출력

		// 속도가 50인 자동차 생성하여 자동차 정보 출력
		Car myCar = new Car(50);
		System.out.println(myCar);

		try {
			// 가속량을 입력받아 자동차 가속
			Scanner scan = new Scanner(System.in);
			System.out.print("가속량 입력: ");
			int value = scan.nextInt(); // 가속량 입력
			myCar.speedUp(value); // 입력 받은 가속량 만큼 자동차를 가속시킴
		}
		catch(SpeedUpException e){
			// 자동차 정보 출력
			myCar.stop(); // 멈춤 
			System.out.println("최대 속도 초과로 가속 불가능하여 자동차를 멈춥니다."); // 적절한 오류 문구 출력
			System.out.println(myCar);   // 어떤 예외가 발생하든 반드시 출력해야 함
		}
		catch(InputMismatchException e2) {
			System.out.println("가속량 입력 오류로 가속 불가능합니다."); // 적절한 오류 문구 출력
			System.out.println(myCar); // 현재 자동차의 정보 출력
		}
	}
}

class Car {
	private int speed; // 속도
	public final int MAX_SPEED = 100; // 최대 속도

	public Car(int speed) {
		this.speed = speed;
	}
	
	// 자동차 가속 과정에서 SpeedUpException 예외 발생시 예외를 잡아서 다음과 같이 처리
	// 자동차 가속 과정에서 TooSmallExceptoin 예외 발생시 예외를 잡아서 처리하지 말고 상위로 전달하도록 처리
	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // 가속
		if((speed + value) > MAX_SPEED) // 만약 현재 자동차 속도와 가속량의 합이 최대치보다 클 경우
			throw new SpeedUpException(); // 상위 클래스로 예외를 전달하여 처리
		speed += value;
		if(value < 0) // 만약 가속량이 0보다 작을 경우
			throw new TooSmallException(); // 상위 클래스로 예외를 전달하여 처리
	}

	public void speedDown(int value) {  // 감속
		speed -= value;
	}

	public void stop() { // 멈춤
		speed = 0;
	}

	@Override // 재정의
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}

class SpeedUpException extends Exception { } // SpeedUpException의 예외클래스
 
class TooSmallException extends Exception { } // TooSmallException의 예외클래스
