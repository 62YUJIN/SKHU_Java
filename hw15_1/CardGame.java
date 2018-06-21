/*
 * 과제 코드 : hw15_1
 * 작성자 : 김유진
 * 작성일 : 2018-06-12
 * 내용 : 
 */
package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다.

class Card {
	private int number; // 카드 번호

	public Card(int number) { 
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
}

//카드 50장을 다루는 덱을 표현하는 클래스 Deck
class Deck {
	public static final int MAX_NUMBER = 50;
	private ArrayList<Card> deck = new ArrayList<Card>();

	// 카드를 생성하여 덱에 넣음
	public Deck() {
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// 카드를 섞음
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// 덱의 맨 앞 카드를 제거하여 리턴
	public Card deal() {
		return deck.remove(0);
	}
}

//자신의 카드 리스트를 지닌 플레이어 클래스 Player
class Player {
	private ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		list.add(card);
	}

	public void showCards() {
		System.out.println(list);
	}

	public Card maxRemove() {
		Card maxCard = list.get(0); // Card형 변수 maxCard 선언과 동시에 list의 0번째 값을 가져옴
		for(int i = 0; i < list.size(); i++) { // 반복문 실행 
			if(maxCard.getNumber() < list.get(i).getNumber()) { // 객체간의 대소비교가 불가능하여, getNumber() 호출 
				maxCard = list.get(i); // 최대값 저장
			}
		}
		list.remove(maxCard); // list의 최대값 삭제
		return maxCard; // 최대값 반환
	}
}

public class CardGame {
	public static void main(String[] args) {

		System.out.println("hw15_1: 김유진");
		System.out.println("p1과 p2의 카드 목록");

		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		Player p2 = new Player();

		for(int i = 0; i < 5; i++) {
			p1.getCard(deck.deal());
			p2.getCard(deck.deal());
		}

		p1.showCards();
		p2.showCards();

		System.out.println("p1과 p2의 최대 카드");
		
		// maxRemove 클래스 호출 후 출력
		System.out.println(p1.maxRemove());
		System.out.println(p2.maxRemove());
		System.out.println("p1과 p2의 카드 목록");
		p1.showCards();
		p2.showCards();

	}
}
