package in.co.rays;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateandTime {
	public static void main(String[] args )throws Exception  {
		Date today = new Date();
		
		SimpleDateFormat format1= new SimpleDateFormat("dd/MM/yyyy");
		String strDate =format1.format(today);
		System.out.println("Format 1 :"+ strDate);
		
		//format method is used to convert date into string 
		SimpleDateFormat format2= new SimpleDateFormat("MMMM dd, yyyy");
		strDate =format2.format(today);
		System.out.println("Format 2 :"+ strDate);
		
		//parse method is used to convert string into date
		Date date =format1.parse("04/09/2004");
		System.out.println(date);
		
	}

}
