package gameTool_01_cards;

public class CardnumtoCardMark {

	public static void main(String[]args) {
		int[] cards = new int[53];
		//for(int i = 0; i < 5; i++) {
			//int card = new java.util.Random().nextInt(53);
			
			
			for (int i = cards.length-1; i > 0; i--) {
	             
	            // Pick a random index from 0 to i
	            int j = new java.util.Random().nextInt(i+1);
	           
	            // Swap array[i] with the element at random index
	            int temp = cards[i];
	          cards[i] = cards[j];
	            cards[j] = temp;
	            System.out.println(cards);
			//card = j;  //添え字調整

				/*マークを表示；カードの数を１３で割った商でグループ分け
				switch (card/13) {
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
					break;
				}
				//if(card>13)? {
				//カードの番号を１３までの自然数に
				int cardnum = card%13;

				int draw = cardnum+1;

			//int draw = 	cards[i];

			//System.out.println(draw);
								*/

			}
	}
}
