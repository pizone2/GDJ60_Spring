package com.iu.si.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.si.product.ProductService;

@Service
public class MemberService {
	
	 @Autowired
	 private MemberDAO memberDAO;
	 
	 public boolean getMemberIdCheck(MemberDTO memberDTO)throws Exception{
		 memberDTO =  memberDAO.getMemberLogin(memberDTO);
		 
		 boolean check = true; // 중복이 아니면 true
		 if(memberDTO != null) {
			check =false;
		 }
		 return check;
	 }
	 
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
		//memberDTO: Clientdptj 입력한 id,pw
		 MemberDTO result = memberDAO.getMemberLogin(memberDTO);
//		 result : ID와 일치하는 모든 정보
		 
		 //pw chech
		 if(result != null && memberDTO.getPw().equals(result.getPw())) {
			 memberDTO.setPw(null);
			 memberDTO.setRoleDTO(result.getRoleDTO());
			 return memberDTO;
		 }else {
			 return null;
		 }
			 
		 
	 }
	 //getMemberPage
	 public MemberDTO getMemberPage(MemberDTO memberDTO) throws Exception {
		 return memberDAO.getMemberLogin(memberDTO);
	 }
		
	
	 
	
	
	
	
}
