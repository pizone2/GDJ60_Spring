package com.iu.si.bankbook;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.si.board.BbsDTO;
import com.iu.si.board.BbsService;
import com.iu.si.member.MemberDTO;
import com.iu.si.util.Pager;

@Controller
@RequestMapping("/bankBookComment/**")
public class BankBookCommentController {
	
	@Autowired
	private BbsService bankBookCommentService;
	
	@RequestMapping( value = "list",method = RequestMethod.GET)
	public ModelAndView getBoardList(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<BbsDTO> ar = bankBookCommentService.getBoardList(pager);
		
		mv.addObject("list", ar);
		mv.setViewName("common/commentList");//수업을 위해 잠깐 보냄
		
		return mv;
	}
	
	@PostMapping("add")
	public ModelAndView setBoardAdd(BankBookCommentDTO bankBookCommentDTO,HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
//		bankBookCommentDTO.setWriter(null);
		bankBookCommentDTO.setWriter("kimjinseo1");
		
		int result = bankBookCommentService. setBoardAdd(bankBookCommentDTO, null, session);
		
		mv.addObject("result",result);
		mv.setViewName("common/ajaxResult");
		return mv;
	}









}
