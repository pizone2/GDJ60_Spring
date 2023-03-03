package com.iu.si.bankbook;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.si.board.BbsDAO;
import com.iu.si.board.BbsDTO;
import com.iu.si.board.BbsService;
import com.iu.si.util.Pager;
@Service//클래스 첫번째를 소문자로 바꾼것이 빈의 이름
public class BankBookCommentService implements BbsService{
	
	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;	
	
	
//	private BankBookCommentDAO bankBookCommentDAO;
	
	
	@Override
	public List<BbsDTO> getBoardList(Pager pager) throws Exception {
		pager.makeRow();
		
		pager.makeNum(bankBookCommentDAO.getTotalCount(pager));
		
		return bankBookCommentDAO.getBoardList(pager);		
	}
	

	
	
	

	@Override
	public int setBoardUpdate(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardAdd(BbsDTO bbsDTO, MultipartFile[] multipartFiles, HttpSession session) throws Exception {
		return bankBookCommentDAO.setBoardAdd(bbsDTO);
	}

	@Override
	public int setBoardDelete(BbsDTO bbsDTO, HttpSession session) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
