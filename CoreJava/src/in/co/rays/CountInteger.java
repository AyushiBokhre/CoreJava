package in.co.rays;

public class CountInteger {
	public static void main(String[] args) {
		String str="Ram123Hello456";
		 int count = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (Character.isDigit(ch)) {
	                count++;
	            }
	        }

	        System.out.println("Total Digits = " + count);
			
		
		
	}

}
