package casino03_bakara;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public int bakara(int plmoney) {


		//設計①
			//デッキを準備
		ArrayList<Integer> card = new ArrayList<Integer>();

	       for(int i = 1 ; i <= 52 ; i++) {
	       	card.add(i);
	       }
	       //デッキをシャッフル
        Collections.shuffle(card);
		ArrayList<Integer> hand = new ArrayList<Integer>();						//プレイヤー手札
		ArrayList<Integer> bankerHand = new ArrayList<Integer>();				//バンカー手札

		System.out.println("バカラの遊び方はとても簡単で、"
				+ "「プレーヤー(Player) 」、「バンカー(Banker) 」、「タイ(Tie) 引き分け」の、"
				+ "いずれかにチップを賭けるだけです。\r\n" +
				"\r\n" +
				"プレーヤー側とバンカー側のどちらに配られたカードの合計が「 9 」に近くなるかを当てると勝ちです。\r\n" +
				"\r\n" +
				"ゲームはとてもシンプルですが、過去の勝敗の結果を見て、"
				+ "次にどちらに賭けるべきかを予想するのがバカラの楽しみの一つです。");

		int replay = 1;
		while(replay ==1 && plmoney > 0) {
			Collections.shuffle(card);
			int dd = 2;
			for(int i= 0 ; i < dd ; i++) {
				bankerHand.add(card.remove(0));
				hand.add(card.remove(0));
			}
			//ナチュラル（カード合計が８か９）判定
			//プレイヤーの手は、「6」か「7」のスコアでスタンドします。
//			プレイヤーは、手持ちのスコアが「0」～「5」の時は3枚目のカードを引き、新しく引いた3枚目のカードを加えて、プレイヤーの手の最終スコアが決定します。
//			バンカーは、プレイヤーが「6」か「7」でスタンドした場合、自分の手持ちのスコアが、「0」～「5」の時は必ず3枚目のカードを引かねばならず、「6」、「7」の時はスタンドしなければなりません。
//			このようにして2～3枚のカードが配られ、勝敗が決定します。ベットの後


			System.out.println("賭けるベットの値を入力してください");
			double bet = new java.util.Scanner(System.in).nextInt();
			plmoney -= bet;

			System.out.println("賭ける対象を選択してください");
			System.out.println("プレーヤー：　１　バンカー：　２　タイ（引き分け）：　３");

			
			
			Score_jud();
			



	}
	return 300;
	}

}
