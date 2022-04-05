package cart;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CartDAO {
	private Connection conn;
	private ResultSet rs;
	

	// test
	
	public CartDAO() {
		try {
			String dbURL="jdbc:mysql://localhost:3306/BBS";
			String dbID="root";
			String dbPassword="apmsetup";
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(dbURL, dbID,dbPassword);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getName() {
		String SQL= "Select price from cart where name=?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(SQL);
			rs= pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public String getNext() {
		String SQL= "Select ;
		try {
			PreparedStatement pstmt=conn.prepareStatement(SQL);
			rs= pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
