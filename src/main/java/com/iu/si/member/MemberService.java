package com.iu.si.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.si.product.ProductService;

@Service
public class MemberService {
	
	 @Autowired
	 private MemberDAO memberDAO;
	 
	 //setMemberJoin
	 
	 public int setMemberJoin(MemberDTO memberDTO)throws Exception{
		 return memberDAO.setMemberJoin(memberDTO);
	 }
	 
	
	 
	
	
	
	
}
