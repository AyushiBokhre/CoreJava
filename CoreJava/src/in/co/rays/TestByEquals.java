package in.co.rays;

public class TestByEquals {
	public static void main(String[] args) {

		String str1 = "Ram";
		String str2 = "Raman";

		String s3 = new String("Welcome");
		String s4 = new String("Welcome");

		System.out.println(str1.equals(str2));
		System.out.println(s3.equals(s4));
	}

}
