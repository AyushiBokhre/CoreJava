package in.co.rays;

public class SecondHighest {
	public static void main(String[] args) {
			int[] a = { 5, 14, 25,26, 27, 8 };
	
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			
		}
		int secondmax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > secondmax && a[i]< max) {
				secondmax = a[i];
			}
			
		}

		System.out.println(secondmax + " is the second largest element of the array.");
	}

}
