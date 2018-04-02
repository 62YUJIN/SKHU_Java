/*
 * 과제코드 : hw4_2
 * 작성자 : 김유진
 * 작성일 : 2017.3.29
 * 내용 : 교재 180~182쪽의 랜덤워크를 참고하여 다음과 같은 프로그램을 작성하기 
 */

package hw4_2;

public class RandomWalk { // 랜덤워크 클래스 정의 

	public static void main(String[] args) {
		int x = 0, y = 0;
		boolean tile[][] = new boolean[5][5]; //불리언 타입의 tile [5][5] 크기의 2차원 배열 생성 
		int steps; // 이동 횟수를 계산할 변수 선언 
		int xgoal = (int) (Math.random()* 5); // x좌표의 목표좌표 난수 5개 생성  
		int ygoal = (int) (Math.random()* 5); // y좌표의 목표좌표 난수 5개 생성 
		tile[0][0] = true; // 시작이 [0][0] 이면,
		System.out.println("hw4_2 : 김유진\n"); // 과제 정보 출력 
		System.out.println("출발 경로 = (0, 0)"); // 출발 경로 출력 
		System.out.println("목표 = (" + xgoal +","+ ygoal + ")"); // 목표좌표 출력 
		System.out.print("이동 경로 =(0,0)"); // 이동 경로 (0, 0)을 추가하고 출력 
		for(steps=0; steps < 20; steps++) { // 20번 동안 반복문 실행 
			int direction = (int) (Math.random()* 4); // 방향을 나타내는 변수에 정수형 난수 4개 생성 
			if(direction == 0 && x - 1 >= 0) { // 방향이 0이고, x-1이 0보다 크거나 같으면 
				x--; // 1 감소 
			}
			else if(direction == 1 && x + 1 < 5) { // 방향이 1이고, x+1이 5보다 작으면 
				x++; // 1 증가
			}
			else if(direction == 2 && y - 1 >= 0) { // 방향이 2이고, y-1이 0보다 크거나 같으면 
				y--; // 1 감소 
			}
			else if(direction == 3 && y + 1 < 5) { // 방향이 3이고, y+1이 5보다 작으면
				y++; // 1 증가
			}
			
			tile[y][x] = true; // tile[y][x]가 참일 때,
			System.out.print("(" + x +","+ y + ")"); // 이동경로 좌표를 하나씩 생성해서 출력 
			if(x == xgoal && y == ygoal) { // 목표 지점에 도착하게 된다면 
				break; // 반복문 멈춤
			}
		}
		System.out.println(); // 줄바꿈 출력 
		System.out.println("----------------------"); // 구분선 출력 
		for(int i = 0; i < 5; i++) { // x축으로 5번 실행 
			for(int j = 0; j < 5; j++) { // y축으로 5번 실행 
				if(i == 0 && j == 0) { // 만약 i가 0이고, j가 0이면, 
					System.out.print("S "); // 시작을 의미하는 S 출력 
					continue; // 반복문 계속 진행 
				}
				if(i == ygoal && j == xgoal) { // i가 ygoal과 같고 j가 xgoal과 같다면
					System.out.print("G "); // 도착을 의미하는 G 출력 
					continue; // 반복문 계속 진행 
				}
				if(tile[i][j] == true) // tile[i][j]가 참이라면,
					System.out.print("# "); // 이동한 좌표는 #으로 표시되게끔 출력
				
				else
					System.out.print(". "); // 이동하지 않은 좌표는 .으로 표시되게끔 출력 
			}
			System.out.println(); // 줄바꿈 출력
		}
		System.out.println("----------------------"); // 구분선 출력 
		if(x == xgoal && y == ygoal) { // 만약 tile의 x와 y가 각각 xgoal, ygoal과 같다면
			System.out.println("성공\n"); // 성공을 출력 
			System.out.println("총 시도 횟수 = " + (steps+1)); // 총 시도 횟수의 값인 steps에 1 증가를 하고 출
		}
		else
			System.out.println("실패\n");	 // 실패한다면 실패함을 출력 
		
	}
}
