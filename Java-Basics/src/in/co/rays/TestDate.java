package in.co.rays;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) throws InterruptedException {
		
//		Date d = new Date();
//
//		System.out.println(d);

		while(true) {
			Date d = new Date();
			System.out.println(d);
			Thread.sleep(1000);
		}
	}
}
