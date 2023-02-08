package com.iu.si.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public List<BankBookDTO> getBankBookList()throws Exception {
		return bankBookDAO.getBankBookList();
	}
	public BankBookDTO getBankDetail(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.getBankBookDetail(bankBookDTO);
	}
	public int setBankAdd(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setBankBookAdd(bankBookDTO);
	}
	public int setBankUpdate(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setBankBookUpdate(bankBookDTO);
	}
	public int setBankDelete(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setBankBookDelete(bankBookDTO);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
