package com.iu.si.bankbook;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.si.util.FileManager;
import com.iu.si.util.Pager;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	//testcase 테스트시 Null이 들어옴 ,API 추가해야함
//	@Autowired //테스트시 주석으로 막고 테스팅할것
	private ServletContext servletContext;
	@Autowired
	private FileManager fileManager;
	
	public List<BankBookDTO> getBankBookList(Pager pager)throws Exception {

		pager.makeRow();
		Long totalCount = bankBookDAO.getBankBookCount(pager);//30 3
		
		pager.makeNum(totalCount);
		
		
		return bankBookDAO.getBankBookList(pager);
	}
	public BankBookDTO getBankDetail(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.getBankBookDetail(bankBookDTO);
	}
	public int setBankBookAdd(BankBookDTO bankBookDTO,MultipartFile pic)throws Exception{
		System.out.println(1);
		int result = bankBookDAO.setBankBookAdd(bankBookDTO);
		System.out.println(2);
		
		
		
	if(!pic.isEmpty()) { //if(pic.getSize() !=0)
		//1.File을 HDD에 저장 경로
		// Project 경로가 아닌 os가 이용하는 경로
		String realPath = servletContext.getRealPath("resources/upload/bankBook");
		System.out.println(realPath);
		String fileName = fileManager.fileSave(pic, realPath);
		
		//2.DB에 저장
		BankBookImgDTO bankBookImgDTO = new BankBookImgDTO();
		bankBookImgDTO.setFileName(fileName);
		bankBookImgDTO.setOriName(pic.getOriginalFilename());
		bankBookImgDTO.setBookNumber(bankBookDTO.getBookNumber());
		
		result = bankBookDAO.setBankBookImgAdd(bankBookImgDTO);
		System.out.println(3);
		
		
	}
		return result;
	}
	public int setBankUpdate(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setBankBookUpdate(bankBookDTO);
	}
	public int setBankDelete(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setBankBookDelete(bankBookDTO);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
