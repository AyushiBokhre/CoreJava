package in.co.rays;

public class RandomNumber {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			int random = (int) (Math.random() * 100) + 1;
			System.out.println(random);
		}
	
	}

}
