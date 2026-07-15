package in.co.rays;

public class AverageOddEven {
	public static void main(String[] args) {

		int n = 5;
		int evensum = 0;
		int oddsum = 0;
		System.out.println("the value of n is " + n);
		for (int i = 1; i <= n; i++) {

			evensum = evensum + (2 * i);

			oddsum = oddsum + (2 * i - 1);

		}

		double evenavg = (double) (evensum) / n;
		double oddavg = (double) (oddsum) / n;
		System.out.println("Average of first " +n+" Even Number : " + evenavg);
		System.out.println("Average of first " +n+" Odd Number : " + oddavg);

	}

}
