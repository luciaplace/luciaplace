package day1112.collectionex;



public class Student {

	String id;
	String name;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	//id�� ������ �̸��� �޶� ���� �л�

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			return ((Student)obj).id.equals(id);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]\n";
	}
	
	
	
	
	
}






