package day1109.stringex;

public class StringEx3 {
	public static void main(String[] args) {
	
		String a = "aaa";
		String b = "bbb";
		
		int i  = a.compareTo(b);
		int i2 = b.compareTo(a);
		int i3 = a.compareTo("aaa");
		
		System.out.println(i);//-1
		System.out.println(i2);//1
		System.out.println(i3);//0
		
		int result = "abcd".compareTo("abcz"); 
		if(result == 0) {
			System.out.println("\"abcd\"�� \"abcz\"�� �����ϴ�.");
		}else if( result < 0) {
			System.out.println("\"abcd\"�� \"abcz\"���� �۽��ϴ�.");
		}else if( result > 0){
			System.out.println("\"abcd\"�� \"abcz\"���� Ů�ϴ�.");
		}
		
	}

}
