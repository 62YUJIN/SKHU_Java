/*
 * 과제코드 : quiz3
 * 작성자 : 김유진
 * 학번 : 201732008
 * 작성일 : 2018.3.27.
 * 과제내용 : 
 */

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		int average = 0;
		int n=0;
		double averagevalue = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("quiz3 : 김유진\n");
		System.out.println("정수 개수 입력 :");
		int i = input.nextInt();
		int[] highaverage = new int[i];
		System.out.println(i+ "개의 정수 입력 :");
		
		for(int k = 0; k < i; k++) {
			n = input.nextInt();
			average += n;
			averagevalue = average / i;
			if(n > averagevalue) {
				highaverage[k] += n;
			}
		}
		
		System.out.println("평균 :" + averagevalue);
		for(int j = 0; j < i; j++) {
			if(highaverage[j] > averagevalue) {
			System.out.println("평균 이상의 값:" + highaverage[j]);
			}
		}
	}

}