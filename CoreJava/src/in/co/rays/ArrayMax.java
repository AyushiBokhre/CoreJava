package in.co.rays;

public class ArrayMax {
	public static void main(String[] args) {
		int[] a = { 5, 14, 25, 27, 8 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}

		}
		System.out.println(max + " is greater.");
	}
}
