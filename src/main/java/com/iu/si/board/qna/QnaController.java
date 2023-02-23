package com.iu.si.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.si.board.BbsDTO;
import com.iu.si.board.BbsService;
import com.iu.si.util.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {

	
	@Autowired
	private BbsService qnaService;
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getBoardList(Pager pager)throws Exception {
		ModelAndView mv = new ModelAndView();
		List<BbsDTO> ar = qnaService.getBoardList(pager);

		
		mv.addObject("list", ar);
		mv.setViewName("board/list");
		
		return mv;
	}
}
