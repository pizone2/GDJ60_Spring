package com.iu.si.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBconnection {

	
	//getConnection
	public static Connection getConnection() throws Exception {
		//1.  ?ó∞Í≤? ?†ïÎ≥?
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. DriverÎ•? Î©îÎ™®Î¶¨Ïóê Î°úÎî©
		Class.forName(driver);
		
		//3. DB ?ó∞Í≤?	
		return DriverManager.getConnection(url, user, password);
				
	
	}
	
	public static void disConnect(Connection con,PreparedStatement st) throws Exception {
		st.close();
		con.close();
	}
	public static void disConnect(ResultSet rs, Connection con,PreparedStatement st) throws Exception {
		st.close();
		con.close();
		rs.close();
	}
	

	
	
	//Î∞∞Ìè¨?†Ñ ?Ç≠?†ú?ïò?Ñ∏?öî
	public static void main(String[] args) {
		 try {
			Connection con = DBconnection.getConnection();
			System.out.println(con != null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
