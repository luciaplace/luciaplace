package day1109.stringex;

public class StringTest1 {
	public static void main(String[] args) {

		String s1 = new String("abc");
		String s2 = new String("abc");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		//String equals()�� ��ü �ȿ� ����� ���ڿ��� ���Ѵ�.
		
		String s3 = "abc";//���ͷ� ���ڿ�
		String s4 = "abc";
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
	}
}
