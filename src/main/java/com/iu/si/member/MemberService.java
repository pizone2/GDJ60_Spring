package com.iu.si.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.si.product.ProductService;

@Service
public class MemberService {
	
	 @Autowired
	 private MemberDAO memberDAO;
	 
	 //setMemberJoin
	 public int setMemberJoin(MemberDTO memberDTO)throws Exception {
		int result = memberDAO.setMemberJoin(memberDTO);
		result = memberDAO.setMemberRoleAdd(memberDTO);
		 return  result;
		}
	 //setMemberUpdate
	 public int setMemberUpdate(MemberDTO memberDTO)throws Exception {
		 int result = memberDAO.setMemberUpdate(memberDTO);
		 return result;
	 }
	 
	 //getMemberLogin
	 public MemberDTO getMemberLogin(MemberDTO memberDTO) throws Exception{
		 return memberDAO.getMemberLogin(memberDTO);
	 }
	 //getMemberPage
	 public MemberDTO getMemberPage(MemberDTO memberDTO) throws Exception {
		 return memberDAO.getMemberPage(memberDTO);
	 }
		
	
	 
	
	
	
	
}
