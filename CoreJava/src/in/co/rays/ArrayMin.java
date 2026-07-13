package in.co.rays;

public class ArrayMin {
	public static void main(String[] args) {
		int[] a = {  5,  14, 25, 27, 8 };
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];

			}

		}
		System.out.println(min + " is smaller.");
	}

}
