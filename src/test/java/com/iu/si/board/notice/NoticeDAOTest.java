package com.iu.si.board.notice;

import static org.junit.Assert.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.si.MyTestCase;
import com.iu.si.board.BbsDTO;
import com.iu.si.util.Pager;

public class NoticeDAOTest extends MyTestCase {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Test
	public void getNoticeListTest() throws Exception{
		Pager pager = new Pager();
		pager.makeRow();
		
		List<BbsDTO> ar = noticeDAO.getBoardList(pager);
		assertNotEquals(0, ar.size());
		
	
	}
	
	
	
	
}
