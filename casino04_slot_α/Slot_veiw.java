package casino04_slot_α;

public class Slot_veiw {

	public static void Slot_veiw(String[] r) {
		for(int i = 0; i <r.length ; i++) {
		System.out.println(r[i]);
		System.out.println(" ");
		}
	}

	public static void Slot_veiw(String[] r, String[] m) {
		for(int i = 0; i <r.length ; i++) {
			System.out.println(r[i] + "     "+m[i]);
			System.out.println(" ");
		}

	}

	public static void Slot_veiw(String[] r,String[] m, String[] l) {
		for(int i = 0; i <r.length ; i++) {
			System.out.println(r[i] + "     "+m[i] + "     "+l[i]);
			System.out.println(" ");
		}

	}
}
