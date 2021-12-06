package day1110.object;

public class NewInstanceEx {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		String className = "java.lang.String";

		Class c = Class.forName(className); 
		String s = (String)c.newInstance();
		
		System.out.println("s:"+s);
	}

}
