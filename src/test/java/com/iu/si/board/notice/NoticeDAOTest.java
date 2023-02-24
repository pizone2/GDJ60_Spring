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

	//List
	@Test
	public void getNoticeListTest() throws Exception{
		Pager pager = new Pager();
		pager.makeRow();
		
		List<BbsDTO> ar = noticeDAO.getBoardList(pager);
		assertNotEquals(0, ar.size());
	}
	
	//Add
	public void setBoardAddTest()throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setTitle("Title1");
		noticeDTO.setWriter("Wrinter");
		noticeDTO.setContents("Contents");
		int result = noticeDAO.setBoardAdd(noticeDTO);
		assertNotEquals(1, result);
	}
	
	
	
	
}
