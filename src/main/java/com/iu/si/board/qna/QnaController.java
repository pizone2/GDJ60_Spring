package com.iu.si.board.qna;

import java.util.List;

import javax.servlet.http.HttpSession;

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
import com.iu.si.board.BoardFileDTO;
import com.iu.si.board.notice.NoticeDTO;
import com.iu.si.util.Pager;

@Controller
@RequestMapping("/qna/**")
public class QnaController {

	
	@Autowired //설명과 실행의 의미
	private QnaService qnaService;
	
	@ModelAttribute("boardName") 
	public String getBoardName() {
		return "qna";
	}
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getBoardList(Pager pager)throws Exception {
		ModelAndView mv = new ModelAndView();
		List<BbsDTO> ar = qnaService.getBoardList(pager);

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
	public ModelAndView setBoardAdd(QnaDTO qnaDTO,MultipartFile[] files,HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = qnaService.setBoardAdd(qnaDTO,files,session);
		
		String message= "등록실패";
		
		if(result>0) {
			message = "글이 등록 되었습니다.";
		}
		
			mv.addObject("result", message);
			mv.addObject("url", "./list");
			mv.setViewName("common/result");
		
		return mv;
	}
	//Detail
	@GetMapping("detail")
	public ModelAndView getBoardDetail(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		BoardDTO boardDTO = qnaService.getBoardDetail(qnaDTO);
		
		 mv.addObject("dto", boardDTO);
		 mv.setViewName("board/detail");
		
		
		return mv;
	}
	@GetMapping("reply")
	public ModelAndView setReplyAdd(BoardDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("board/reply");
		return mv;
	}
	
	@PostMapping("reply")
	public ModelAndView setReplyAdd(QnaDTO qnaDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		
		int result = qnaService.setReplyAdd(qnaDTO);
		
		String message= "등록실패";
		if(result>0) {
			message = "글이 등록 되었습니다.";
		}
		
		mv.setViewName("common/result");
		mv.addObject("result", message);
		mv.addObject("url", "./detail?num="+qnaDTO.getNum());
		return mv;
	}
	@PostMapping("delete")
	public ModelAndView setBoardDelete(BbsDTO bbsDTO,HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("common/result");
		
		int result =  qnaService.setBoardDelete(bbsDTO,session);
		
		String message="삭제 실패";
		if(result>0) {
			message = "삭제 성공";
		}
		mv.addObject("result", message);
		mv.addObject("url", "./list");
		return mv;
	}
	
	@GetMapping("fileDown")
	public ModelAndView getFileDown(BoardFileDTO boardFileDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		boardFileDTO = qnaService.getBoardFileDetail(boardFileDTO);
		
		mv.addObject("boardFile", boardFileDTO);
		mv.setViewName("fileDownView");
		return mv;
	}
	@GetMapping("update")
	public ModelAndView setBoardUpdate(BoardDTO boardDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		boardDTO = qnaService.getBoardDetail(boardDTO);
		
		
		mv.addObject("dto", boardDTO);
		mv.setViewName("board/update");
		return mv;
		
	}
	
	
	
	
	
	
	
}
