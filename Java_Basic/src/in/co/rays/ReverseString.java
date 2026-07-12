package in.co.rays;

public class ReverseString {
	public static void main(String[] args) {
		String str = "access";
	//	String reverse = "";
		System.out.println("Original String : " + str);
//		for (int i = 0; i < str.length(); i++) {
//			reverse = str.charAt(i) + reverse;
//		}
		System.out.print("Reverse String : ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	//	System.out.println("Reverse String : " + reverse);
	}

}
