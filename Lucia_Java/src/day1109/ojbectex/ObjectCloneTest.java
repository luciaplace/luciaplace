package day1109.ojbectex;

class Point implements Cloneable{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	protected Point clone() throws CloneNotSupportedException {
		return (Point)super.clone();
	}
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Point orig = new Point(3, 5);
		Point copy = orig.clone();
		
		System.out.println(orig);
		System.out.println(copy);
		System.out.println(orig == copy);
		
		orig.x = 10;
		System.out.println(orig);
		System.out.println(copy);
		
		
	}

}
