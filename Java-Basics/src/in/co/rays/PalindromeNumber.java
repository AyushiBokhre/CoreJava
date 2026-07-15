package in.co.rays;

public class PalindromeNumber {
	public static void main(String[] args) {
		int number=1231;
		int temp=number;
		System.out.println("The original Number is "+temp);
		int reverse=0;
		
		while (number != 0) {
			int digit = number % 10; // 2,3,4,5
			reverse = reverse * 10 + digit;//2,23,234,2345
			number = number / 10; //6543,654,65,
		}
		System.out.println("The Reverse of the Number is "+reverse);
		if(temp==reverse) {
			System.out.println(temp+" is palindrome Number.");
			
		}else {
			System.out.println( temp+ " is not Palindrome Number.");
		}
	}

}
