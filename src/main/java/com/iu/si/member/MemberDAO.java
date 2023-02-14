package com.iu.si.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.si.util.DBconnection;

@Repository  //객체생성,DAO 역할
public class MemberDAO {
	
	@Autowired //pool에서 Data Type이 일치하는 객체를 검색
			   //같은 Type이 여러개 있으면 bean name으로 검색
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.si.member.MemberDAO.";

	//set
	public int setMemberJoin(MemberDTO memberDTO)throws Exception {
	
		return sqlSession.insert(NAMESPACE+"setMemberJoin",memberDTO );
	}
	
	public int setMemberRoleAdd(MemberDTO memberDTO)throws Exception {
		return sqlSession.insert(NAMESPACE+"setMemberRoleAdd",memberDTO);
	}
	public int setMemberUpdate(MemberDTO memberDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setMemberUpdate", memberDTO);
	}
	//get
	public MemberDTO getMemberLogin(MemberDTO memberDTO)throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getMemberLogin", memberDTO);
	}
	
	public MemberDTO getMemberPage(MemberDTO memberDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getMemberPage", memberDTO);
	}
	
	


	



	
	
	
	
	
	
	
	
}