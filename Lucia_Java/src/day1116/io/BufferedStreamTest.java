package day1116.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long mills = System.currentTimeMillis();
		
		
		try(FileInputStream fis = new FileInputStream("a.zip");
				BufferedInputStream b = new BufferedInputStream(fis); //연결시켜주
				FileOutputStream fo = new FileOutputStream("copy.zip");
				BufferedOutputStream bo = new BufferedOutputStream(fo)){
			
			int i;
			while((i =fis.read())!= -1) //읽어온 값이 있다
			{bo.write(i); //아웃풋으로 내보내
			}mills = System.currentTimeMillis() - mills;
		}catch (FileNotFoundException e) {e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) {e.printStackTrace();
			// TODO: handle exception
		}System.out.println("복사시간"+mills+"ms");

	}

}
