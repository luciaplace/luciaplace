package day1104.inheritance;


class Point{
	int x;
	int y;
	
	Point(){}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String getLocation() {
		return x+","+ y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){
		//super();//Point()호출
		super(x, y);
		this.z = z;
	}
	
	@Override // 어노테이션
	public String getLocation() {
		//return x+","+y+","+z;
		return super.getLocation()+","+ z;
	}	
}

public class PointTest {
	public static void main(String[] args) {
		Point3D p1 = new Point3D(1, 2, 3);
		System.out.println(p1.x +" "+ p1.y+ " "+ p1.z);
	}

}
