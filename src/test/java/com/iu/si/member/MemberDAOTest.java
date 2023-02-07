package com.iu.si.member;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.si.product.ProductDAO;

public class MemberDAOTest {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void setMemberJoinTest()throws Exception{
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("text1");
		memberDTO.setPw("text1");
		memberDTO.setMemberName("text1");
		memberDTO.setMemberphone("text1");
		memberDTO.setEmail("text1");
		int result = memberDAO.setMemberJoin(memberDTO);
		assertEquals(1, result);
		
		
	}
	
	
}
