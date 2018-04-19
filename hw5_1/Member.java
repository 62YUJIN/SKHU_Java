/*
 * 작성자 : 박찬우
 * 작성일 : 2018.04.16.
 * 파일 내용 : 회원을 나타내는 클래스
 */
package hw5_1;

public class Member {
   int rate = 0; // 회원의 등급을 저장할 변수 rate 선언 및 0으로 초기화
   int point = 0; // 회원의 포인트를 저장할 변수 point 선언 및 0으로 초기화
   void giveRate (int rating) { // 등급을 뜻하는 매개변수 rank를 받아 rate에 저장함
      rate = rating;
   }
   void givePoint () {
      if (rate == 1) // 만약 rate가 1이면 point에 100을 더한값을 저장한다
         point+=100;
      else if (rate == 2) // 만약 rate가 2이면 point에 50을 더한값을 저장한다
         point+=50;
      else if (rate == 3) // 만약 rate가 3이면 point에 40을 더한값을 저장한다
         point+=40;
      else // 만약 그 이외라면 point에 10을 더한값을 저장한다
         point+=10;
   }
   double searchDiscount () {
      if (point>=100) // 만약 point가 100 이상이라면 0.2를 반환
         return 0.2;
      else // 그 이외라면 0.1을 반환
         return 0.1;
   }
}
