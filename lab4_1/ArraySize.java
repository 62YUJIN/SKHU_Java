/*
 * 과제코드 : lab4_1
 * 작성자 : 김유진
 * 작성일 : 2017.03.22
 * 내용 : 정수 배열
 */
package lab4_1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySize {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("lab4_1 : 김유진\n");
		
		System.out.println("배열 길이 입력 :");
		int size1 = input.nextInt(); //사용자로부터 배열 길이(size)를 입력받음
		
		int[] array = new int[size1]; //길이가 size인 배열을 생성
		
		System.out.println("5개의 정수 입력 :");
		for(int i = 0; i<array.length; i++) { 
			int intnum = input.nextInt(); //사용자로부터 size 개의 정수값을 입력
			array[i] = intnum; //배열에 저장
		}
		
		System.out.println("배열  = " + Arrays.toString(array)); //보다 깔끔한 코드를 위해 Arrays 임포트
		System.out.println("배열  = " + Arrays.toString(array)); //보다 깔끔한 코드를 위해 Arrays 임포트
	}

}

