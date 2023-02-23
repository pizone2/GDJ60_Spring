package com.iu.si.board.qna;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.si.MyTestCase;
import com.iu.si.board.BbsDTO;
import com.iu.si.util.Pager;

public class QnaDAOTest extends MyTestCase {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void getQnaListTest() throws Exception{
		Pager pager = new Pager();
		pager.makeRow();
		
		List<BbsDTO> ar = qnaDAO.getBoardList(pager);
		assertNotEquals(0, ar.size());
	}
	
}
