package in.co.rays;

public class TestString {
	public static void main(String[] args) {
		String name = " Aayushi Bokhre";
		System.out.println("String Length : " + name.length());
		System.out.println("7th character is : " + name.charAt(6));
		System.out.println("'Bokhre' index is " + name.indexOf("Bokhre"));
		System.out.println("First 'h' position : " + name.indexOf('h'));
		System.out.println("last 'h' position : " + name.lastIndexOf('h'));
		System.out.println("'y' is replaced by 'r' : " + name.replace('y', 'r'));
		System.out.println("Lowercase : " + name.toLowerCase());
		System.out.println("Uppercase : " + name.toUpperCase());
		System.out.println("Starts with 'Ayushi' : " + name.startsWith("Aayushi"));
		System.out.println("Ends with 'hre' ; " + name.endsWith("hre"));
		System.out.println("substring from index 8 : " + name.substring(8));

	}

}
