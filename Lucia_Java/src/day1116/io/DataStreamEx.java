package day1116.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeInt(100);
			dos.writeChar('a');
			dos.writeFloat(3.14f);
			dos.writeUTF("안녕");
		}catch(IOException e) {e.printStackTrace();
		}
		try(FileInputStream fi = new FileInputStream("data.txt");
				DataInputStream di = new DataInputStream(fi)){
			
			System.out.println(di.readInt());
			System.out.println(di.readChar());
			System.out.println(di.readFloat());
			System.out.println(di.readUTF());
			
			
		}catch(FileNotFoundException ae) {ae.printStackTrace();
		}catch (IOException e) {e.printStackTrace();
			// TODO: handle exception
		}

}
	
}
