package Ch26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C05DBSelect {
public static void main(String[] args) {
		
		
		// 연결관련 정보 저장용 변수
		String id = "root";					// DB 연결 ID
		String pw = "test1234";				// DB 연결 Pw
		String url = "jdbc:mysql://localhost:23306/shopdb";		// 연결URL (DBMS마다 상이함)
		
		
		// DB연결 객체 관련 참조변수
		Connection conn = null;				// DB연결객체용 참조변수
		PreparedStatement pstmt = null;		// SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;				// 쿼리결과(Select결과) 수신용 참조변수
		
		// 연결하기
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			// DB 드라이버 로드
			System.out.println("Driver Loading Success!!");
			
			
			conn = DriverManager.getConnection(url, id, pw);	// DB Connection 객체 받기
			System.out.println("DB Connected...");
			
			// SELECT, INSERT, DELETE, UPDATE....
			pstmt = conn.prepareStatement("SELECT * FROM tbl_customer");
			
			rs = pstmt.executeQuery();
			if(rs != null) {			// 데이터 조회되었다면
				while(rs.next()) {
					System.out.print(rs.getInt("userid") + " ");
					System.out.print(rs.getString("name") + " ");
					System.out.print(rs.getInt("age") + " ");
					System.out.print(rs.getString("address") + " ");
					System.out.println();
				}
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {rs.close();} catch (Exception e) {e.printStackTrace();}
			try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {conn.close();} catch (Exception e) {e.printStackTrace();}
		}
		
		
	}
}
