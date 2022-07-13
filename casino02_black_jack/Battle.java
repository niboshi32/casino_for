package casino02_black_jack;

import java.util.ArrayList;

public class Battle {

	public static double battles(double a ,ArrayList<Integer> x, ArrayList<Integer> y) {
		int xsum = 0;
		int ysum = 0;
		ArrayList<Integer> xnum = new ArrayList();
		ArrayList<Integer> ynum = new ArrayList();
		
		for(int f = 0; f<x.size();f++) {
			xnum.add(x.get(f)%13+1);
		}
		for(int f = 0; f<y.size();f++) {
			ynum.add(y.get(f)%13+1);
		}
		
		for(int f = 0; f<xnum.size();f++) {
			if(xnum.get(f)>10) {
				xsum += ((int)xnum.get(f)/10)*10;	 
			}else if(xnum.get(f) <=10){
				xsum += xnum.get(f);
			}
		}
		for(int f = 0; f< ynum.size();f++) {
			if(ynum.get(f)>10) {
				ysum += ((int)ynum.get(f)/10)*10;	 
			}else if(ynum.get(f) <=10){
				ysum += ynum.get(f);
			}
		}
		System.out.println("ディラーの合計は" + ysum + "です");
		if (xsum > 21) {
			System.out.println(xsum + "です、バーストしました");
			a = 0;
		}else if (xsum ==21) {
			a = a*1.5;
			System.out.println("おめでとうございます、ブラックジャックです");
			System.out.println(xsum +"あなたの勝ちです。ベット" + a + "が加算されます");
		}else if(xsum > ysum) {
			a = a*1.5;
			System.out.println(xsum +"あなたの勝ちです。ベット" + a + "が加算されます");
		}else if(ysum > 21){
			a = a*1.5;
			System.out.println(xsum +"あなたの勝ちです。ベット" + a + "が加算されます");
		}else if(xsum == ysum) {
			System.out.println(xsum +"惜しい、引き分けです");
		}else if(xsum < ysum) {
			System.out.println(xsum +"あなたの負けです。ベットは回収されました");
			a = 0;
		}
		return a;


		// TODO 自動生成されたコンストラクター・スタブ
	}


}
