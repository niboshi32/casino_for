package casino04_slot_α;
import java.util.ArrayList;
import java.util.Collections;

public class SlotIcon {
	static ArrayList<String> icon;
	
	public static String getIcon() {
		return icon.remove(0);
	}
	public SlotIcon() {
		// TODO 自動生成されたコンストラクター・スタブ
		icon= new ArrayList<String>();
		icon.add("５");
		icon.add("７");
		icon.add("♡");
		icon.add("★");
		icon.add("＄");
		Collections.shuffle(icon);
	}
	public static String[] line(String[] a) {

			for(int i = 0; i<3 ; i++) {
				a[i] =getIcon();
			}
			return a;
		}

}
