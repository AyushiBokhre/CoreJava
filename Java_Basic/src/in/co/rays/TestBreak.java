package in.co.rays;

public class TestBreak {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i == 6) {
				break;
			}

			System.out.println("Number : " + i);
		}
	}
}
