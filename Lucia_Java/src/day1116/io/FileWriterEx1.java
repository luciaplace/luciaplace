package day1116.io;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter fr = new FileWriter("writer.txt")){
			fr.write(65);
			fr.write('a');
			fr.write("안녕하세요\n");
			fr.write("65");
			
			
		}catch (IOException e) {e.printStackTrace();
			// TODO: handle exception
		}System.out.println("end"); 
		
		
	
	}

}
