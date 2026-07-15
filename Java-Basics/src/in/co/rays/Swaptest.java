package in.co.rays;

public class Swaptest {
	public static void main(String[] args) {
		int a = 13;
		int b = 15;
		System.out.println("Before Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
