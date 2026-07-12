package in.co.rays;
import java.util.Date;
import java.text.SimpleDateFormat;

public class TestSimpleDateFormat {
	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Format 1: "+sdf.format(d));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd G 'at' hh:mm:ss z");
		System.out.println("Format 2: "+sdf1.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEE,MMM d ''yy");
		System.out.println("Format 3: "+sdf2.format(d));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("h:mm a");
		System.out.println("Format 4: "+sdf3.format(d));

		SimpleDateFormat sdf4 = new SimpleDateFormat("H:mm ");
		System.out.println("Format 5: "+sdf4.format(d));

		SimpleDateFormat sdf5 = new SimpleDateFormat("H:mm:ss:SSS");
		System.out.println("Format 6: "+sdf5.format(d));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("K:mm a,z");
		System.out.println("Format 7: "+sdf6.format(d));
		
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy.MMMMM.dd GGG hh:mm aaa");
		System.out.println("Format 8: "+sdf7.format(d));
	
	}
}
