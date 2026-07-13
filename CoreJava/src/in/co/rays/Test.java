package in.co.rays;

public class Test {
	public static void main(String[] args) {
		int number = 14;
		int count = 0;

		while (number != 0) {

			if (number % 2 == 0) {

				number = number / 2;

				count++;

			} else {

				number = number - 1;

				count++;

			}

		}

		System.out.println(count);
	}

}
