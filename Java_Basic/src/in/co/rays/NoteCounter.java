package in.co.rays;

public class NoteCounter {
	public static void main(String[] args) {
		int[] note = { 200, 100, 50, 10 };
		int amount = 5000;
		for (int i = 0; i < note.length; i++) {
			if (amount >= note[i]) {
				int count = amount / note[i];
				System.out.println(note[i] + " = " + count);
				amount = amount % note[i];
			}
		}

	}

}
