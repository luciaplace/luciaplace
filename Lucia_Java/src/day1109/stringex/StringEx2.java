package day1109.stringex;

public class StringEx2 {
	public static void main(String[] args) {
		String filename = "hello.java";
		int index = filename.indexOf(".");
		String name = filename.substring(0, index);
		String ext = filename.substring(index+1);

		System.out.println(
				filename+"�� ���ϸ��� "+name+"�̰� Ȯ���ڴ� "+ext+"�Դϴ�.");
		
		String abc = "abc";
		System.out.println(abc.indexOf("Z"));//-1
			
	}

} 
