package day1117.io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "/"; // 경로 ~~ 맥은 그냥 /로 씀 
		File f1 = new File(filePath); //파일 객체 생성시에는 반드시 경로를 지정하기 !
		
		String list[] = f1.list(); // 하위 디렉토리 이름과 파일명을 스트링 배열로 만들어 가지고온다. 
		
		for (String name:list){
			File f2 = new File(filePath,name);
			if(f2.isDirectory()) { //디렉토리 폴더인가요? 맞으면t 아니면f 리턴  
				System.out.printf("%s : 디렉토리 \n", name);
			}else {System.out.printf("%s : 파일 (%,dbyte)\n", name, f2.length()); // length()로 파일의 크기를 구할 수 있다.  
		}
	}

	
	File f3 = new File("/Users/hyeonjieun/Downloads/:test.txt");
	System.out.println(f3.createNewFile());
	System.out.println(f3.getPath());
	System.out.println(f3.getAbsolutePath());
	System.out.println(f3.getCanonicalPath());
	
	System.out.println(f3.getName());
	
	//System.out.println(f3.delete());
	
	File f4 = new File("/Users/hyeonjieun/Downloads/:test.txt");
	File f5 = new File("/Users/hyeonjieun/Downloads/:test1.txt");
	
	System.out.println(f4.renameTo(f5)); // f4 이름을 f5 이름으로 변경하
}
}