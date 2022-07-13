package gameTool_00_scoreBorad;

public class Score_board {

	public static void main(String[]args) {
		System.out.println("科目数を入力してくだだい");
		int kamokusuu = new java.util.Scanner(System.in).nextInt();


		int[] scores1 = new int[kamokusuu];
		for (int i = 0; i<kamokusuu;i++) {
			System.out.println("各科目の数値を入力してください");
		 scores1[i] = new java.util.Scanner(System.in).nextInt();
		}


		double sum = 0;
		for (int i= 0;i<scores1.length;i++){
		sum += scores1[i];
		}
		double avg = sum*10/scores1.length;
		avg = Math.round(avg)/10;
		System.out.println("合計点："+ sum);
		System.out.println("平均点："+ avg);
	}

}
