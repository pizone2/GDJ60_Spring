package com.iu.si.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/bankBook/*") //하위폴더가 더 있다면 **
public class BankBookController {

	@Autowired
	private BankBookService bankBookService;
	
//	private ModelAndView modelAndView;
	
	//list							  //요청을 특정 메서드와 매핑하기 위해 사용하는것이다.
	@RequestMapping(value = "list", method = RequestMethod.GET)   //value은 요청받을 url을 설정
	public ModelAndView getBankBookList()throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BankBookDTO> ar = bankBookService.getBankBookList();
		
		mv.setViewName("bankBook/list"); //prefix,suffix 생각
		mv.addObject("list", ar); //이름 마음대로
		return mv;
	}
	//detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView getBankBookDetail(BankBookDTO bankBookDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getBankDetail(bankBookDTO);	
		
		mv.setViewName("bankBook/detail");
		mv.addObject("detail", bankBookDTO);
		return mv;
	}
	//add(GET),form 이동
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView setBankBookAdd(ModelAndView mv)throws Exception{
		mv.setViewName("bankBook/add");
		return mv;
	};
	
	//add(POST)DB Insert
	@RequestMapping(value = "add", method = RequestMethod.POST )
	public ModelAndView setBankBookAdd(BankBookDTO bankBookDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
//		int result = bankBookService.setBankAdd(bankBookDTO);
		
		mv.setViewName("redirect:./list");  // Forward = redirect:
		
		return mv;
	}
	//delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView setBankBookDelete(BankBookDTO bankBookDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setBankDelete(bankBookDTO);
		
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	//update
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setBankBookUpdate(BankBookDTO bankbookDTO)throws Exception{
		ModelAndView mv = new ModelAndView();
		bankbookDTO = bankBookService.getBankDetail(bankbookDTO);
		mv.setViewName("bankBook/update");
		mv.addObject("dto", bankbookDTO);
		
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setBankBookUpdate(BankBookDTO bankBookDTO,ModelAndView mv) throws Exception{
		int result = bankBookService.setBankUpdate(bankBookDTO);
		
		mv.setViewName("redirect:./list");
		
		return mv;
	}
	
	
	
}
