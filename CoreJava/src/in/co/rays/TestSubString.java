package in.co.rays;

public class TestSubString {

	public static void main(String[] args) {

		String str = "ujlabcujl";
		int count = 0;
		int c = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j <= (str.length() - 1); j++) {
				if (i == str.charAt(j)) {
					// System.out.println(i + " " + str.charAt(j));
					count++;
				}
			}
			if (count > 0) {
				System.out.println(i + " = " + count);
				count = 0;
				c++;
			}
		}
		System.out.println(c);
	}
}
