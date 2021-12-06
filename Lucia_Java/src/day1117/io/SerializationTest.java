package day1117.io;

import java.io.*;

class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String name;
	String job;
	
	public Person() {}
	
	public Person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
	
	
}

public class SerializationTest{
	
	public static void main(String [] args) {
		
		Person p1 = new Person("현지은", "사원");
		Person p2 = new Person("김철수", "이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(p1);
			oos.writeObject(p2);
		
		}catch(IOException e) {e.printStackTrace();
		
		}try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person p3=(Person)ois.readObject();
			Person p4=(Person)ois.readObject();
			System.out.println(p3);
			System.out.println(p4);
		}catch(IOException e) {e.printStackTrace();
		
		}catch(ClassNotFoundException e) {e.printStackTrace();
		
		}
		
		
		
	}
	
	
}
