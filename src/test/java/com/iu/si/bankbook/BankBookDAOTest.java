package com.iu.si.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.si.MyTestCase;



public class BankBookDAOTest extends MyTestCase {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test //
	public void getBankBookListTest()throws Exception{
		List<BankBookDTO> ar = bankBookDAO.getBankBookList();
		assertNotEquals(0, ar.size());
	}
	
	@Test
	public void setBankBookAddTest()throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(43L);
		bankBookDTO.setBookName("test");
		bankBookDTO.setBookDetail("test");
		bankBookDTO.setBookRate(0);
		bankBookDTO.setBookSale(0L);
		int result = bankBookDAO.setBankBookAdd(bankBookDTO);
		assertEquals(1, result);
	}
	
	
	
	
	
	
	
	
	

}
