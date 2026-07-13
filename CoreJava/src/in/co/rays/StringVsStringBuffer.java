package in.co.rays;

public class StringVsStringBuffer {
	public static void main(String[] args) {
		String name = "Ayushi";

		System.out.println("original String:"+name);
		System.out.println(name.replace('y', 'r'));
		System.out.println("After replace Method:"+name);

		System.out.println("-------------------------------------");

		StringBuffer sb = new StringBuffer("Ayushi");
		System.out.println("original String:"+sb);
		System.out.println(sb.append(" Bokhre"));
		System.out.println("After replace Method:"+sb);

	}
}
