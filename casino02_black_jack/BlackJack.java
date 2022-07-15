package casino02_black_jack;

import java.util.ArrayList;
import java.util.Collections;

public class BlackJack {
	/*設計①
	 * プレイヤーとディラーに配牌
	 	* プレイヤーとディラーに
	 	* 1～13の数値を二つ与える
	 	* 11,12,13を10として扱う
	 	*
	 * 設計②
	 	* ディラーのカード表示
	 	* ディラーの2枚のうち1枚のカードを表示する
	 * 設計③
	 	*プレイヤーのカードを一枚引くか、そのままの選択肢を表示
	 	*バースト判定
	 * 設計④
	 	*プレイヤーとディラーのカードそれぞれのの和を比較し
	 	*プレイヤーがディラーのカードの合計以上かつ21以下の場合
	 	*「You Win」と表示
	 *
	 */

	public static int BlackJack(int plmoney) {
		//設計①
		//デッキを準備
		ArrayList<Integer> card = new ArrayList<Integer>();

        for(int i = 1 ; i <= 52 ; i++) {
        	card.add(i);
        }
        //デッキをシャッフル
        Collections.shuffle(card);

		ArrayList<Integer> hand = new ArrayList<Integer>();						//プレイヤー手札
		ArrayList<Integer> dealerHand = new ArrayList<Integer>();				//ディラー手札

		System.out.println("ブラックジャックのルール\n"
				+ "まず賭ける金額を宣言します。\r\n" +
				"\r\n" +
				"次にブラックジャックのディーラーが各プレイヤーにカードを２枚ずつ表向きにして配ります。\r\n" +
				"ディーラー自身にも１枚は表向きにして、もう１枚はふせて配ります。\r\n" +
				"そしてお互い必要に応じてカードを引いて、カードの合計が「２１」に近い方が勝ちとなります。");

		System.out.println("プレイヤーは、ディーラーの見えているカードから最終手を想像して、"
				+ "\nヒット（カードを引く）かステイ（カードを引かない）かを決めます。\n"
				+ "合計が２１を超えるまで、カードは好きなだけ引けます。\n"
				+ "合計が２１を超えると、バースト（合計が２２以上のこと）となり負けとなります。\n "
				+ "またはディーラーが２１を超えると、無条件でプレイヤーの勝ちとなります。\n");

		System.out.println("プレイヤーの最初の２枚のカードが、エースと10、J、Q、Kの組み合わせであれば、\r\n"
				+ "プレーヤーは「ブラックジャック」となり、ディーラーもブラックジャックでない限り、\r\n"
				+ "賭けたチップの1.5倍が払われます。\n"
				+ "もし、プレーヤー、ディーラーともに「ブラックジャック」の場合は、\r\n"
				+ "引き分けとなり賭け金はそのまま戻されます。\r\n"
				+ "\n "
				+ "\n ");
			//設計② 2枚配牌
		int replay = 1;
		while(replay ==1 && plmoney > 0) {
			Collections.shuffle(card);
			int dd = 2;
			for(int i= 0 ; i < dd ; i++) {
				dealerHand.add(card.remove(0));
				hand.add(card.remove(0));
			}
			System.out.println("賭けるベットの値を入力してください");
			double bet = new java.util.Scanner(System.in).nextInt();
			plmoney -= bet;

			System.out.println("ディラーのカードの一つは" );
			Card_view.cardMark(dealerHand.get(0));
			System.out.println(" " );
			System.out.println("プレイヤーの手札は");
			handVeiw(hand);
			System.out.println(" " );

			//ブラックジャック判定
			if((hand.get(0)%13 ==1 && hand.get(1)%13/10 == 1) || (hand.get(1)%13 ==1 && hand.get(0)%13/10 == 1)) {
				bet = bet*1.5;
				System.out.println("おめでとうございますブラックジャックです");
				plmoney += bet;
				
				hand.clear();
				dealerHand.clear();
				System.out.println("続けますか?");
				System.out.println("続ける：１　やめてホールに戻る：０　");
				replay = new java.util.Scanner(System.in).nextInt();

				break;
			}

			//設計③ヒット＆ステイ
			System.out.println("操作を入力してください" + " \n");
			System.out.println("ヒット：一枚引く：1");
			System.out.println("ステイ：そのまま勝負する:2");
			int hit = new java.util.Scanner(System.in).nextInt();
				if(hit ==1 ) {
					int c = 1;
					for(int a = 0; a<c; a++) {
						hand.add(card.remove(0));
						handVeiw(hand);

						System.out.println("もう一枚引きますか？");
						System.out.println("ヒット：1 ステイ：2");
						int cs = new java.util.Scanner(System.in).nextInt();
						if(cs == 1) {
							c++;
						}
					}
				}
			//ディラー手札調整,ディーラーの最初の二枚の合計が１１以下なら一枚引く
			if(dealerHand.get(0)%13 +dealerHand.get(1)%13 <=11) {
				dealerHand.add(card.remove(0));
			}

			System.out.println(" " );

			//設計④ディラーと勝負
			plmoney += Battle.battles(bet,hand,dealerHand);

			System.out.println("\n " + "現在の所持金は" + plmoney + "\n ");

			hand.clear();
			dealerHand.clear();
			System.out.println("続けますか?");
			System.out.println("続ける：１　やめてホールに戻る：０　");
			replay = new java.util.Scanner(System.in).nextInt();

		}
		return plmoney;
	}
	//手札表示メソッド
	public static void handVeiw(ArrayList<Integer> h) {
		for(int f = 0; f<h.size();f++) {
			Card_view.cardMark(h.get(f));
		}
	}
}
