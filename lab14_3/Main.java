/*
 * 과제 코드 : lab14_3
 * 작성자 : 김유진
 * 작성일 : 2018-06-05
 * 내용 : 예외처리
 */
package lab14_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_3: 김유진");

		// 속도가 50인 자동차 생성하여 자동차 정보 출력
		Car myCar = new Car(50);
		System.out.println(myCar);
		
		try {
			// 가속량을 입력받아 자동차 가속
			Scanner scan = new Scanner(System.in);
			System.out.print("가속량 입력: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
			System.out.println(myCar);
		}
		catch(SpeedUpException e){
			// 자동차 정보 출력
			myCar.stop();
			System.out.println(myCar);
			System.out.println("myCar is stopped...");
		}
		catch(InputMismatchException e2) {
			// 가속 페달을 밟지 않고, 수다 떨었을 때 예외 처리
			System.out.println("운전 시에는 수다는 금물입니다! 가속 페달을 밟아주세요!");
		}
	}
}

class Car {
	private int speed; // 속도
	public final int MAX_SPEED = 100;   // 최대 속도

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException {  // 가속
		if((speed + value) > MAX_SPEED)
			throw new SpeedUpException();
		speed += value;
	}

	public void speedDown(int value) {  // 감속
		speed -= value;
	}

	public void stop() { // 멈춤
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}

class SpeedUpException extends Exception {

}
