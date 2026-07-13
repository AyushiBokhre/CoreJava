package in.co.rays;

public class CountVowel {
	public static void main(String[] args) {
		String str = "Hello, I am Ayushi.";
		str=str.toLowerCase();
		int count = 0;
	
		
		for (int i = 1; i < str.length(); i++) {
			 char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;

			}
		}
		System.out.println("Total Number of Vowels are " + count);

	}

}
