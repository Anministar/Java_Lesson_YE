package Ch26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C04DBDelete {
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
			pstmt = conn.prepareStatement("delete from tbl_customer where userid=?");
			pstmt.setInt(1, 2);
			
			int result = pstmt.executeUpdate();
			if(result != 0){
				System.out.println("DELETE 성공");
			} else {
				System.out.println("DELETE 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {pstmt.close();} catch (Exception e ) {e.printStackTrace();}
			try {conn.close();} catch (Exception e) {e.printStackTrace();}
		}
		
		
	}

}
