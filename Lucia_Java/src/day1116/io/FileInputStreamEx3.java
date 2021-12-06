package day1116.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("input.txt")) { 
			byte[]b = new byte[1000];
			int i;
			while((i=fis.read(b)) !=-1) {
				for(int k = 0; k<i; k++) { System.out.println((char)b[k]);
				
			}System.out.println();
				System.out.println(new String(b));
			}
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


