package gameTool_01_cards;

public class Card_view {
	public static void cardMark(int c) {
		//int[] cards = new int[53];
		//for(int i = 0; i < cards.length; i++) {
		//	int cardnum= cards[i];
		//	cardnum = i;//添え字調整


			//マークを表示；カードの数を１３で割った商でグループ分け
			switch (c/13) {
			case 0 :
				System.out.println("Spade");
				break;
			case 1 :
				System.out.println("Hreat");
				break;
			case 2 :
				System.out.println("Club");
				break;
			case 3 :
				System.out.println ("Dia");
				break;
			case 4 :
			}
				//カードの番号を１３までの自然数に
				int cardnum = c%13+1;
			System.out.println(cardnum);

	}

}
