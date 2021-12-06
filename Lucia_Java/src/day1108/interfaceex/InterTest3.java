package day1108.interfaceex;


import java.util.Scanner;

interface Say{
	public void hello();//인사를 한다.
}
class Korean implements Say{
	@Override
	public void hello() {
		System.out.println("안녕");	
	}
}
class English implements Say{
	@Override
	public void hello() {
		System.out.println("hello");
	}
}
class Etc implements Say{
	@Override
	public void hello() {
		System.out.println("Hi~~~");
	}
}

public class InterTest3 {
	public static void main(String[] args) {
		
		Korean k = new Korean();
		English e = new English();
		Etc et = new Etc();
		
		System.out.print("언어코드를 입력하세요 ex)ko, en >"); 
		Scanner s = new Scanner(System.in);
		String lang = s.next();
		
		Say say;
		
		if(lang.equals("en")) {
			say = e;
		}else if(lang.equals("ko")) {
			say = k;
		}else {
			say = et;
		}
		say.hello();
	s.close();
	
	}

}
