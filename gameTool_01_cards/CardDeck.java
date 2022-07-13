package gameTool_01_cards;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck{

	public ArrayList cardDeck(){
		//1から５３まできれいに並んだデッキ
		ArrayList<Integer> card = new ArrayList<Integer>();

        for(int i = 1 ; i <= 53 ; i++) {
        	card.add(i);

       // for(int hand : card) {
//        System.out.println(card.get(0));
//		return card.remove(0);
        }
        //シャッフルしたデッキ
        Collections.shuffle(card);
        System.out.println("デッキの残りカード枚数は" + card.size());
        return card;
//        System.out.println(card.get(0));
	}
	public void cardDeckr() {
		
	}
	 //デッキをシャッフル
	public void cardShuffle(){
		 Collections.shuffle(cardDeck());
	}
//	public static int draw(int a) {
//		for(int i = 0 ; i <= a ; i++) {
//        	return remove(0);}
//	}

}
