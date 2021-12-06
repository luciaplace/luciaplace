package day1108.interfaceex;


import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;

	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();//ArrayList객체 안에 저장된 데이터의 갯수
	}
	
}
