package in.co.rays;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 65432;
		int reverse = 0;
		System.out.println("The given number is " + number);
		while (number != 0) {
			int digit = number % 10; // 2,3,4,5
			reverse = reverse * 10 + digit;//2,23,234,2345
			number = number / 10; //6543,654,65,
		}

		System.out.println("Reverse : " + reverse);

	}

}
