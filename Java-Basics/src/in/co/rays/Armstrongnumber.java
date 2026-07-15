package in.co.rays;

public class Armstrongnumber {
	public static void main(String[] args) {
		String str = "1634";
		int len = str.length();

		int number = Integer.parseInt(str);
		int r = 0;
		int sum = 0;
		int n = number;

		while (n > 0) {
			r = n % 10;
			sum = sum + (int) Math.pow(r, len);
			n = n / 10;

		}
		if (number == sum) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong number");
		}
	}

}
