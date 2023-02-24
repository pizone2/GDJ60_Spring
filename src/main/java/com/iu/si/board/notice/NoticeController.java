package com.iu.si.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.si.board.BbsDTO;
import com.iu.si.board.BbsService;
import com.iu.si.board.BoardDTO;
import com.iu.si.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@ModelAttribute("boardName")
	public String getBoardName() {
		return "notice";
	}
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getBoardList(@ModelAttribute Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BbsDTO> ar = noticeService.getBoardList(pager);
		
		mv.addObject("list", ar);
		mv.setViewName("board/list");
		
		return mv;
	}
	//add
	@GetMapping("add")
	public ModelAndView setBoardAdd()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/add");
		return mv;
	}
	//add
	@PostMapping("add")
	public ModelAndView setBoardAdd(NoticeDTO noticeDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setBoardAdd(noticeDTO);
		
		String message= "등록실패";
		if(result>0) {
			message = "글이 등록 되었스빈다.";
		}
		
		mv.addObject("result", message);
		mv.addObject("url", "./list");
		mv.setViewName("common/result");
		
		return mv;
	}
	
	//Detail
	@GetMapping("detail")
	public ModelAndView getBoardDetail(NoticeDTO noticeDTO,MultipartFile [] files)throws Exception{
		ModelAndView mv = new ModelAndView();
		 BoardDTO boardDTO = noticeService.getBoardDetail(noticeDTO);
		
		 mv.addObject("dto", boardDTO);
		 mv.setViewName("board/detail");
		
		
		return mv;
	}
	
	
	
	
	
}
