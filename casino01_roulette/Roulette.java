package casino01_roulette;

public class Roulette {
	/*
	 * ルーレット
	 */
	public static int roulette(int plmoney) {
			System.out.println("こちらはルーレットです");
			System.out.println("ボールが0～36、00の番号のポケットに入るのを当てるゲームです");

			System.out.println("現在あなたの所持金は" + plmoney +"$ です");
			int replay = 1;
			while(plmoney > 0 && replay == 1) {

			System.out.println("賭ける金額を入力してください");
			int plbet = new java.util.Scanner(System.in).nextInt();
			plmoney -= plbet;
			System.out.println("賭ける方法を選択してください");
			System.out.println("インサイドベット：０");
			System.out.println("アウトサイドベット：１");
			int betchoise = new java.util.Scanner(System.in).nextInt();

			if(betchoise == 0) {

				System.out.println("こちらはインサイドベットです");
				System.out.println("以下のかけ方からお一つ選び番号を入力してください");
				System.out.println("1目賭け ・・・ 特定の数字1つに賭けます            （配当36倍です）：①");
				System.out.println("2目賭け ・・・ 隣り合った数字2つに賭けます        （配当18倍です）：②");
				System.out.println("3目賭け ・・・ 横1列の数字3つに賭けます           （配当12倍です）：③");
				System.out.println("4目賭け ・・・ 十字の4方向にある数字4つに賭けます （配当 9倍です）：④");
				System.out.println("5目賭け ・・・ 数字5つ（0、00、1、2、3）に賭けます（配当 7倍です）：⑤");
				System.out.println("6目賭け ・・・ 横2列の数字6つに賭けます           （配当 6倍です）：⑥");

				int betchoiseIn = new java.util.Scanner(System.in).nextInt();

				switch(betchoiseIn) {
					case 1 :
						System.out.println("1目賭けです、数字を宣言してください");
						int decideOne = new java.util.Scanner(System.in).nextInt();

						if (decideOne == rouletteRun()) {
							atari(36,plmoney , plbet);
						}else {
							hazure(plmoney);
						}
						break;

					case 2 :
						System.out.println("2目賭けです、1つ目の数字を宣言してください");
						int decideTwoFst = new java.util.Scanner(System.in).nextInt();
						System.out.println("1つ目の数字の隣の宣言してください");
						int decideTwoSed = new java.util.Scanner(System.in).nextInt();

						final int TWO =	rouletteRun();
						if (decideTwoFst ==TWO|| decideTwoSed == TWO) {
							atari(18,plmoney , plbet);
						}else {
							hazure(plmoney);
						}
						break;

					case 3 :
						System.out.println("3目賭けです、列の先頭の数字を宣言してください");
						int decidethr = new java.util.Scanner(System.in).nextInt();

						final int THREE =	rouletteRun();
						if(decidethr == THREE || decidethr++ == THREE ||decidethr+2 == THREE) {
							atari(12,plmoney , plbet);
						}else {
							hazure(plmoney);
						}
						break;
					case 4 :
						System.out.println("４目賭けです、十字の4方向にある数字4つを宣言してください");
						int decidefourF = new java.util.Scanner(System.in).nextInt();
						int decidefourS = new java.util.Scanner(System.in).nextInt();
						int decidefourT = new java.util.Scanner(System.in).nextInt();
						int decidefourFo = new java.util.Scanner(System.in).nextInt();

						final int FOUR =	rouletteRun();

						if((FOUR == 0 || FOUR == 1 || FOUR == 2 || FOUR == 3 || FOUR == 37) ) {
							atari(9,plmoney ,plbet);
						}else {
							hazure(plmoney);
						}
						break;
					case 5 :
						System.out.println("5目賭けです：0、00、1、2、3に賭けます");

						final int FIVE =	rouletteRun();
						if(FIVE == 0 || FIVE == 1 || FIVE == 2 || FIVE == 3 || FIVE == 37) {
							atari(7,plmoney , plbet);
						}else {
							hazure(plmoney);
						}
						break;

					case 6 :
						System.out.println("６目賭けです、一つ目の列の先頭の数字を宣言してください");
						int decideSixth = new java.util.Scanner(System.in).nextInt();
						System.out.println("二つ目の列の先頭の数字を宣言してください");
						int decideSixths = new java.util.Scanner(System.in).nextInt();


						final int SIX =	rouletteRun();
						if(decideSixth == SIX || decideSixth++ == SIX || decideSixth+2 == SIX ||
							decideSixths == SIX || decideSixths++ == SIX || decideSixths+2 == SIX	) {
							atari(6,plmoney , plbet);
						}else {
							hazure(plmoney);
						}
						break;
				}

			}else if(betchoise == 1) {
				System.out.println("こちらはアウトサイドベットです");
				System.out.println("以下のかけ方からお一つ選び番号を入力してください");
				System.out.println("縦一列 　　・・ 縦1列の数字12つに賭ける 　　　　　　　　　（配当は3倍です）：①");
				System.out.println("大中小 　　・・ 1～12、13～24、25～36のどれかに賭ける 　　（配当は3倍です）：②");
				System.out.println("前半・後半 ・・ 1～18、19～36のどちらかに賭ける 　　　　　（配当は2倍です）：③");
				System.out.println("奇数・偶数 ・・ 奇数か偶数のどちらかに賭ける　　　　　　　（配当は2倍です）：④");

				int betchoiseOut = new java.util.Scanner(System.in).nextInt();
				switch(betchoiseOut) {
				case 1:
					System.out.println("縦一列に賭けます、列の先頭の数字を入力してください");
					int decideLine = new java.util.Scanner(System.in).nextInt();

					if(decideLine == 3) {
						decideLine -= 3;
						if (rouletteRun()%3 ==decideLine) {
							atari(3,plmoney , plbet);
						}else {
							hazure(plmoney);
						}
						break;
					}

				case 2 :
					System.out.println("大中小賭けます、番号を選んでください① 1～12、② 13～24、③ 25～36");
					int decidesize = new java.util.Scanner(System.in).nextInt();
					if((rouletteRun()-1)/12 + 1 == decidesize) {
						atari(3,plmoney , plbet);
					}else {
						hazure(plmoney);
					}
					break;

				case 3 :
					System.out.println("前半・後半に賭けます、番号を選んでください① 1～18、②19～36");
					int decidehalf = new java.util.Scanner(System.in).nextInt();
					if((rouletteRun()-1)/18 + 1 == decidehalf) {
						atari(2,plmoney , plbet);
					}else {
						hazure(plmoney);
					}
					break;

				case 4 :
					System.out.println("奇数・偶数 に賭けます：奇数、①　偶数、②");
					int decidecol = new java.util.Scanner(System.in).nextInt();
					if(decidecol == 2) {
						decidecol -=2;
						if(rouletteRun()%2 == decidecol) {
							atari(2,plmoney , plbet);
						}else {
							hazure(plmoney);
						}
						break;
					}

				}

			}
		System.out.println("続けますか?");
		System.out.println("続ける：１　やめてホールに戻る：０　");
		replay = new java.util.Scanner(System.in).nextInt();
		}
	return plmoney;

	}

	public static int rouletteRun () {
		int rouletteNum = new java.util.Random().nextInt(38);
		String[] rouletteCol = {"赤","黒"};
		int akakuro = rouletteNum%2;
		System.out.println("出たのは"+ rouletteCol[akakuro] + "の" + rouletteNum + "です");
		return rouletteNum;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public static void atari(int haitou,int bet, int money) {
		System.out.println("おめでとうございます、" + haitou + "倍の配当です");
		System.out.println(bet*haitou +"$が所持金に加わります" );
		money += bet*haitou;
		System.out.println("現在の所持金は"  + money);
		}

	public static void hazure(int money) {
		System.out.println("残念ながらはずれです");
		System.out.println("現在の所持金は"  + money + "です");
	}

}
