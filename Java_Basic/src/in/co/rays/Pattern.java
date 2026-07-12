package in.co.rays;

public class Pattern {
	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <=5; i++) {
			for (int j = n; j > 0; j--) {
				System.out.print("\t");
			}
			n--;
			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
			System.out.println();

		}
		n = n + 2;
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				System.out.print("\t");
			}
			
			n++;

			for (int k = 1; k <= (i * 2) - 1; k++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
			System.out.println();

		}
	}

}
