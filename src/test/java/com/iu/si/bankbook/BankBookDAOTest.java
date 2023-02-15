package com.iu.si.bankbook;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.si.MyTestCase;
import com.iu.si.bankbook.BankBookDAO;
import com.iu.si.bankbook.BankBookDTO;



public class BankBookDAOTest extends MyTestCase {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	@Test //
	public void getBankBookListTest()throws Exception{
		List<BankBookDTO> ar = bankBookDAO.getBankBookList();
		assertNotEquals(0, ar.size());
	}
	
	
	@Test
	public void getBankBookDetailTest() throws Exception{
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(15L);
		bankBookDTO = bankBookDAO.getBankBookDetail(bankBookDTO);
		assertNotNull(bankBookDTO);
	}
	
	
	@Test
	public void setBankBookAddTest()throws Exception{
		
		for(int i=0;i<30;i++) {
		Random r = new Random();
		double d = r.nextDouble();
		int num =(int) d*1000; //123
		d = num/100.0;
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBookNumber(43L);
		bankBookDTO.setBookName("서서적금"+i);
		bankBookDTO.setBookDetail("test");
		bankBookDTO.setBookRate(d);
		bankBookDTO.setBookSale(1L);
		int result = bankBookDAO.setBankBookAdd(bankBookDTO);
		
		}
	}
	
	
	
	
	
	
	
	
	

}
