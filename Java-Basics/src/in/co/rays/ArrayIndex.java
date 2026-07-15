package in.co.rays;

public class ArrayIndex {
	public static void main(String[] args) {
		int[] a = { 5, 14, 25, 27, 8 };
		int number = 27;
		for (int i = 0; i < a.length; i++) {
			if (number == a[i]) {
				System.out.println(a[i] + " is found at " + i);
			}
		}
	}

}
