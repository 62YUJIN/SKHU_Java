/*
 * 과제코드 : lab4_2
 * 작성자 : 김유진
 * 작성일 : 2017.3.27.
 * 내용 : 배열 매개변수
 */
package lab4_2;

import java.util.Scanner;

public class ArrayMethod {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		
		System.out.println("lab4_2 : 김유진\n");
		System.out.println("정수의 갯수 입력 :");
		n = input.nextInt();
		int[] sumarray = new int[n];
		
		for(int i = 0; i < n; i++) {
			int num = input.nextInt();
			sumarray[i] += num;
		}
		System.out.println("배열 원소의 합 :" + IntSum(sumarray));
	}
	private static int IntSum(int[] array) {
		int sum = 0;
		
		for(int i : array) {
			sum += i;
		}
		return sum;
	}
	
}
