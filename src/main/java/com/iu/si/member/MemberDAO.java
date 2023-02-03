package com.iu.si.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.stereotype.Repository;

import com.iu.si.util.DBconnection;

@Repository
public class MemberDAO {

	//getMemberJoin
	public int getMemberJoin()throws Exception {
		Connection con = DBconnection.getConnection();
		
		String sql = "";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		rs.next();
		
		int num = rs.getInt(1);
		
		DBconnection.disConnect(rs, con, st);
		
		
		return num;
	}
	
	//getMeberLogin
	public int getMemberLogin(MemberDTO memberDTO)throws Exception {
		Connection con = DBconnection.getConnection();
		
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		st.setString(1,memberDTO.getId());
		st.setString(2,memberDTO.getPw());
		
		if(rs.next()) {
			//로그인성공
		}else {
			//로그인실패
		}
		
		
		DBconnection.disConnect(rs, con, st);
		
		
		return num;
	}
	
	
	
	

	
	
	
	
	//setAddMember
	public int setAddMember(MemberDTO memberDTO) throws Exception{
		Connection con = DBconnection.getConnection();
		
		String sql = "INSERT INTO MEMBER VALUES (?,?,?,?,?,?)";
		
		PreparedStatement st = con.prepareStatement(sql);
//		MemberDTO memberDTO = new MemberDTO();
		
		st.setString(1,memberDTO.getId() );
		st.setString(2,memberDTO.getPw() );
		st.setString(3,memberDTO.getMembername() );
		st.setString(4,memberDTO.getMemberphonenumber() );
		st.setString(5,memberDTO.getMemberemail() );
		st.setString(6,memberDTO.getMemberaddress() );
		
		int result = st.executeUpdate();
		
		DBconnection.disConnect(con, st);
		
		return result;
		
		
	}
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id2");
		memberDTO.setPw("pw2");
		memberDTO.setMembername("name1");
		memberDTO.setMemberphonenumber("010");
		memberDTO.setMemberemail("asdf@asdf");
		memberDTO.setMemberaddress("seoul");
		try {
			int result = memberDAO.setAddMember(memberDTO);
			System.out.println(result != 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}