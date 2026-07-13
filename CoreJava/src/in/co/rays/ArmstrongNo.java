package in.co.rays;

public class ArmstrongNo {
	public static void main(String[] args) {
		int number = 153;

		int a = number % 10;
		int b = (number / 10) % 10;
		int c = number / 100;

		int sum = a * a * a + b * b * b + c * c * c;
		if (sum == number) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}

	}

}
