package day1116.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) !=-1) {System.out.println((char)i);
		}System.out.println("end");}
			catch (FileNotFoundException e) { e.printStackTrace();
			// TODO: handle exception
		}catch (IOException e) { e.printStackTrace();
			// TODO: handle exception
		}
	}

}
