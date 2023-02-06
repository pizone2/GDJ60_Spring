package com.iu.si.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.si.util.DBconnection;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.si.member.MemberDAO.";

	//getMemberJoin
	public int getMemberJoin(MemberDTO memberDTO)throws Exception {
		
		return ;
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
			//�α��μ���
		}else {
			//�α��ν���
		}
		
		int num = 1;
		
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
		st.setString(3,memberDTO.getMemberName() );
		st.setString(4,memberDTO.getMemberphone() );
		st.setString(5,memberDTO.getEmail() );
		st.setString(6,memberDTO.getMemberName() );
		
		int result = st.executeUpdate();
		
		DBconnection.disConnect(con, st);
		
		return result;
		
		
	}
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id2");
		memberDTO.setPw("pw2");
		memberDTO.setMemberName("name1");
		memberDTO.setMemberphone("010");
		memberDTO.setEmail("asdf@asdf");
		memberDTO.setMemberName("seoul");
		try {
			int result = memberDAO.setAddMember(memberDTO);
			System.out.println(result != 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
}