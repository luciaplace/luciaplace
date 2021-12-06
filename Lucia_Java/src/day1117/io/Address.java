package day1117.io;

import java.util.Objects;

/*CSV(Comma-separated values) 텍스트 파일에 기록된 회원 명단을 입력 받아 중복을 제거하고, 정렬한 후에 출력하는 간단한 주소록 프로그램을 작성하고자 한다.

-	회원 정보는 성명(영문), 이메일 주소 및 전화번호 항목으로 구성되어 있다.
-	회원 정보는 CSV 형식으로 텍스트 파일에 저장되어 있다. (파일명 : addrInput.txt)
-	회원 정보를 텍스트 파일에서 읽어 들인 후, 중복된 데이터를 제거해야 한다.//set hascode equals
(이름이 같다면 제거함)
-	중복이 제거된 데이터는 이름 알파벳 순서대로 정렬해야 한다.
-	Java API 중 Collection API (Map, Set, etc)를 이용해서 데이터를 가공해야 한다.
-	addrOutput.txt문서에 출력하세요*/




public class Address implements Comparable<Address> {
	String name;
	String email;
	String tel;
	public Address(String name, String email, String tel) {
		super();
		this.name = name;
		this.email = email;
		this.tel = tel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name); // = name.hashcode();
	}
	/*if(obj ! = null && obj instanceof Address)
	 *{return name.equals(((Address)obj).name);} 
	 * return false;*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", email=" + email + ", tel=" + tel + "]";
	}
	
	
	
}
