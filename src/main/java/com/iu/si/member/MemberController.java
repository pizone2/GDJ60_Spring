package com.iu.si.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller //객체생성, Controller 역할
@RequestMapping("/member/*")
public class MemberController {
	//특정 uri로 요청을 보내면 Controller에서 어떠한 방식으로 처리할지 정의를 하는데,
	//이떄 들어온 요청을 특정 메서드와 매핑하기 위해 사용하는것이 @RequestMapping임.
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "join")
	public String setMemberJoin() {
		System.out.println("Member Join");
		return "member/memberJoin";
	}
//	
//	public ModelAndView setMemberJoin(ModelAndView mv,MemberDTO memberDTO)throws Exception{
//		
//
//	}
	
	
	
	
}
