package casino02_black_jack;

public class Card_view {
	public static void cardMark(int c) {

		String mark = null;
			//マークを表示；カードの数を１３で割った商でグループ分け
			switch (c/13) {
			case 0 :
				mark = "♠";
				break;
			case 1 :
				mark ="♡";
				break;
			case 2 :
				mark ="♣";
				break;
			case 3 :
				mark ="♢";
				break;
			case 4 :
				mark ="♠";
			}
			int cardnum = c%13+1;
			System.out.print(mark + " "+ cardnum + "   ");	
				//カードの番号を１３までの自然数に
			

	}

}
