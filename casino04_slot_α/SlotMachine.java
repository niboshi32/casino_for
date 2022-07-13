package casino04_slot_α;

import java.util.ArrayList;
import java.util.Collections;

public class SlotMachine {

	public static int SlotMachine(int a) {
		//スコアごとの取得点数の違いは未実装
		ArrayList<String> icon;

			icon= new ArrayList<String>();
			icon.add("５");
			icon.add("７");
			icon.add(" ♡");
			icon.add("★");
			icon.add("＄");
			Collections.shuffle(icon);

		String[] r = new String[3];
		String[] m = new String[3];
		String[] l = new String[3];

		int end = 1;
		System.out.println("一回100です");

		while(end == 1) {
			a-=100;
			System.out.println("1を押してスロットを止めてください");
			int stop = new java.util.Scanner(System.in).nextInt();
			if(stop == 1) {
				Collections.shuffle(icon);
				for(int i = 0; i<3 ; i++) {
					r[i] =icon.get(i);
				}

				Slot_veiw.Slot_veiw(r);
				stop = 0;
			}

			stop = new java.util.Scanner(System.in).nextInt();
			if(stop == 1) {
				Collections.shuffle(icon);
				for(int i = 0; i<3 ; i++) {
					m[i] =icon.get(i);
				}
				Slot_veiw.Slot_veiw(r,m);
				stop = 0;
			}

			stop = new java.util.Scanner(System.in).nextInt();
			if(stop == 1) {
				Collections.shuffle(icon);
				for(int i = 0; i<3 ; i++) {
					l[i] =icon.get(i);
				}
				Slot_veiw.Slot_veiw(r,m,l);
				stop = 0;
			}

			//判定
			//添え字が同じまたは階段上がりor階段さ下がり
			if(r[0].equals(m[0]) && m[0].equals(l[0])) {					//上段
				System.out.println("おめでとうございます上段が揃いました");
				a+=1000;

			}else if(r[1].equals(m[1]) && m[1].equals(l[1])) {					//中段
				System.out.println("おめでとうございます中段が揃いました");
				a+=1000;

			}else if(r[2].equals(m[2]) && m[2].equals(l[2])) {					//下段
				System.out.println("おめでとうございます下段が揃いました");
				a+=1000;

			}else if(r[0].equals(m[1]) && m[1].equals(l[2])) {					//右下がり斜め
				System.out.println("おめでとうございます揃いました");
				a+=1000;

			}else if(r[2].equals(m[1]) && m[1].equals(l[0])) {					//上段
				System.out.println("おめでとうございます揃いました");
				a+=1000;

			}else {
				System.out.println("揃いませんでした");
			}
			System.out.println("続けますか?");
			System.out.println("続ける：１　やめてホールに戻る：２");
			end = new java.util.Scanner(System.in).nextInt();

		}
		System.out.println("現在の所持金は" + a );
		return a;


	}


}
