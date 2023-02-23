package com.iu.si.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.si.MyTestCase;
import com.iu.si.board.BbsDTO;
import com.iu.si.util.Pager;
 //설정파일정보를 가져옴 (mytestcase)
public class BankbookCommentDAOTest extends MyTestCase {
	
	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	
	//list
	@Test
	public void getBoardListTest()throws Exception{
		Pager pager = new Pager();
		pager.setBookNumber(385L);
//		pager.setKind("writer");
//		pager.setSearch("김");
		pager.makeRow();
//		long count = bankBookCommentDAO.getTotalCount(pager);
		List<BbsDTO> ar = bankBookCommentDAO.getBoardList(pager);
		assertNotEquals(0, ar.size());
	}
	
}
