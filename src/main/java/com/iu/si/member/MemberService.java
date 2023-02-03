package com.iu.si.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.si.product.ProductService;

@Service
public class MemberService {
	
	 @Autowired
	 private MemberService memberService;
	
	 @Autowired
	 private MemberDAO memberDAO;
	 
	 public MemberService() {
		 this.memberDAO =  new MemberDAO();
	 }
	
	 public int getMemberJoin()throws Exception {
		 return memberDAO.getMemberJoin();
	 }
	 
	 public void getMemberLogin()throws Exception {
		 return memberDAO.getMemberLogin();
	 }
	 
	 public void getMemberPage()throws Exception {
		 return memberDAO.getMemberPage();
	 }
	 
	
	
	
	
}
