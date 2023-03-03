package com.iu.si.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller //객체생성, Controller 역할
@RequestMapping("/member/*")
public class MemberController {
	//특정 uri로 요청을 보내면 Controller에서 어떠한 방식으로 처리할지 정의를 하는데,
	//이떄 들어온 요청을 특정 메서드와 매핑하기 위해 사용하는것이 @RequestMapping임.
	
	@PostMapping("memberIdCheck")
	public ModelAndView getMemberIdCheck(MemberDTO memberDTO)throws Exception{
		boolean check = memberService.getMemberIdCheck(memberDTO);
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("result", check);
		mv.setViewName("common/ajaxResult");
		return mv;
	}
	
	@RequestMapping(value = "memberAgree", method = RequestMethod.GET)
	public void setMemberAgree()throws Exception{
	}
	
	@Autowired
	private MemberService memberService;
	@RequestMapping(value = "memberJoin", method = RequestMethod.GET)
	public ModelAndView setMemberAdd()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/member/memberJoin");
		return mv;
	}
	@RequestMapping(value = "memberJoin",method = RequestMethod.POST)
	public ModelAndView setMemberJoin(MemberDTO memberDTO)throws Exception {
		ModelAndView mv = new ModelAndView();
		int result = memberService.setMemberJoin(memberDTO);
		mv.setViewName("redirect:../");
		return mv;
	}
	@RequestMapping(value = "memberUpdate",method = RequestMethod.GET)
	public ModelAndView setMemberUpdate(HttpSession session)throws Exception {
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		
		memberDTO =memberService.getMemberPage(memberDTO);
		mv.addObject("dto", memberDTO);
		mv.setViewName("/member/memberUpdate");
		return mv;
	}
	@RequestMapping(value = "memberUpdate",method = RequestMethod.POST)
	public ModelAndView setMemberUpdate(MemberDTO memberDTO, HttpSession session)throws Exception {
		ModelAndView mv = new ModelAndView();
		MemberDTO sessionMemberDTO	= (MemberDTO)session.getAttribute("member");
		memberDTO.setId(sessionMemberDTO.getId());
		
		int result = memberService.setMemberUpdate(memberDTO);
//		if(result>0) {
//			session.setAttribute("member", memberDTO);
//		}
		mv.setViewName("redirect:./memberPage");
		return mv;
	}
	
	@RequestMapping(value = "memberLogin", method = RequestMethod.GET)
	public ModelAndView getMemberLogin()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/memberLogin");
		return mv;
	}
	
	@RequestMapping(value = "memberLogin",method = RequestMethod.POST)
	public ModelAndView getMemberLogin(MemberDTO memberDTO,HttpServletRequest request)throws Exception {
		ModelAndView mv = new ModelAndView();
		memberDTO= memberService.getMemberLogin(memberDTO);
		if(memberDTO !=null) {
		HttpSession session = request.getSession();
		session.setAttribute("member", memberDTO);
		}
		mv.setViewName("redirect:../");
		return mv;
	}
	@RequestMapping(value = "memberLogout", method = RequestMethod.GET)
	public ModelAndView getMemberLogout(HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		session.invalidate();
		mv.setViewName("redirect:../");
		return mv;
	}
	@RequestMapping(value ="memberPage", method = RequestMethod.GET )
	public ModelAndView getMemberPage(HttpSession session)throws Exception {
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		 
		memberDTO= memberService.getMemberPage(memberDTO);
		mv.addObject("dto", memberDTO);
		mv.setViewName("member/memberPage");
		return mv;
	}
	
}
