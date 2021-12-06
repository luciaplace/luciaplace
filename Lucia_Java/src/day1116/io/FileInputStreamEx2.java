package day1116.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		try(FileInputStream fis = new FileInputStream("input.txt")) { 
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		System.out.println((char)fis.read());
		} 
		catch(FileNotFoundException e)		
		{e.printStackTrace();}
		catch (IOException e) { e.printStackTrace();
			// TODO: handle exception
		}System.out.println("end");
}
	}



