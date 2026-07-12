package in.co.rays;

public class TestSwitch {
	public static void main(String[] args) {
		int a= 4;
		int b=6;
		int num=3;
		switch (num) {
		case 1:
			System.out.println("Addition : "+a+b);
			break;
		case 2:
			System.out.println("Subraction : "+(a-b));
			break;
		case 3:
			System.out.println("Multiplication : "+(a*b));
			break;
		case 4:
			System.out.println("Division : "+(a/b));
			break;
		default:
			System.out.println("None");
		}
	}

}
