package jdbcex.test;

import java.sql.*;

public class Test {
	public static void main(String[] args) {

		String driver="oracle.jdbc.driver.OracleDriver";
		 String url="jdbc:oracle:thin:@orcl_medium?TNS_ADMIN=/Users/hyeonjieun/Downloads/wallet_orcl/";  
		 String sql = "select deptno from dept";
		 
		 Connection conn = null;
		 
		 PreparedStatement pstmt = null;
		 
		 ResultSet rs = null;
		 try {
		 
		     
		     Class.forName(driver);
		     // Oracle Driver 로딩
		   
		     conn=DriverManager.getConnection(url,"scott","Hje121103041234"); 
		     // 데이터베이스 connection 
		     
		     pstmt=conn.prepareStatement(sql);
		     // sql을 실행하기 위한  prepareStatement 생성
		 
		     rs=pstmt.executeQuery();
		     // sql 실행
		     
		     
		     while(rs.next()){
		      System.out.println("이름 : "+rs.getString(1));
		      // sql 실행 시 첫번째 결과값을 출력
		     }
		 
		 
		     rs.close();
		     //resultset 닫음
		     
		     pstmt.close();
		     conn.close();
		     //연결 종료
		 
		 
		 }catch(Exception e){
		 
		   e.printStackTrace();
		 }
		
		
		
	}

}
