package in.co.rays;

public class Fibonacci {
	public static void main(String[] args) {
		int number=5;
		int a =0;
		int b=1;
		int sum=0;
		
		for(int i=0;i<= number;i++) {
			sum= a+b;
			a=b;
			b=sum;
		}
		System.out.println(sum);
	}
	

}
