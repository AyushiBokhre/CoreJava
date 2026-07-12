package in.co.rays;

public class Table {
	public static void main(String[] args) {
		int num = 4;
		int[] table = new int[10];
		// Store values in array
		for (int i = 0; i < 10; i++) {
			table[i] = num * (i + 1);
		}

		// Print table
		System.out.println("Multiplication Table of " + num + ":");
		for (int i = 0; i < 10; i++) {
			System.out.println(num + " x " + (i + 1) + " = " + table[i]);
		}

	}
}
