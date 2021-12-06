package day1109.ojbectex;

public class StringHashCode {
	public static void main(String[] args) {

		String s1 = "AAA";
		String s2 = new String("AAA");
		String s3 = "BBB";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
