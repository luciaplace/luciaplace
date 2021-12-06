package day1111.collection;

public class Able implements Comparable<Able> {
	String empno;
	int net, ejb, xml, total;

	public Able(int total) { // Constructor
		this.total = total;
	}

	public Able(String no, int n, int e, int x) { // Constructor
		empno = no;
		net = n;
		ejb = e;
		xml = x;
		total = n + e + x;
	}

	public int getTotal() { // getTotal 은 total 값 리
		return total;
	}

	@Override
	public int compareTo(Able o) { //매개변수의 값과 비교하여 줄세우기. 같으면 0의값 앞이면 -1 후면 1을 리턴함. 
		int result = getTotal() - o.getTotal(); //결과는 합계와 매개변수 합계의 차로 구한다. 
		if(result == 0) { //만약 총합의 비교결과가 같다면 
			result = empno.compareTo(o.empno); //기존 사원번호와 매개변수 사원번호를 비교하여 값을 구하라 
		}
		return result; //같지않다면 결과에따라 줄세우세여 
	}

	@Override
	public String toString() {
		return "Able [empno=" + empno + ", net=" + net + ", ejb=" + ejb + ", xml=" + xml + ", total=" + total
				+ ", getTotal()=" + getTotal() + "]\n";
	}
	
}
